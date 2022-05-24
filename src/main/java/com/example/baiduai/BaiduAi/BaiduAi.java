package com.example.baiduai.BaiduAi;


import com.example.baiduai.BaiduAi.Util.Base64Util;
import com.example.baiduai.BaiduAi.Util.FileUtil;
import com.example.baiduai.BaiduAi.Util.HttpUtil;


import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;



import org.springframework.stereotype.Service;


import java.net.URLEncoder;
import java.util.List;


/**
 * 人体关键点识别
 */
@Service
@Slf4j
public class BaiduAi {

    public String body_analysis() {
        log.info(BaiduAiGetToken.getAuth());
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/image-classify/v1/body_analysis";
        try {
            // 本地文件路径
//            String filePath = "C:\\Users\\86157\\Desktop\\htmltest\\3.jpg";
//            String filePath = "D:\\AllProject\\testOlder\\1.jpg";
            String filePath = "/root/image/1.jpg";

            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String imgParam = URLEncoder.encode(imgStr, "UTF-8");

            String param = "image=" + imgParam;

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
//            String accessToken = BaiduAiGetToken.getAuth();
            String accessToken = BaiduAiGetToken.getAuth();
            String result = HttpUtil.post(url, accessToken, param);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean get() {
        String json = this.body_analysis();
        Gson gson = new Gson();
        JsonRootBean jsonRootBean = gson.fromJson(json, JsonRootBean.class);
        if (jsonRootBean.getPerson_num() == 0) {
            return true;
        }
        List<Person_Info> person_info = jsonRootBean.getPerson_info();
//        System.out.println(person_info.size());
        Person_Info person_info1 = person_info.get(0);
        body_parts body_parts = person_info1.getBody_parts();
        Double scoreLeft = body_parts.getLeft_knee().getScore();
        Double scoreRight = body_parts.getRight_knee().getScore();

        if ((scoreLeft - scoreRight) > 0.1 || (scoreLeft - scoreRight) < -0.1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        /*String json = BaiduAi.body_analysis();
        Gson gson = new Gson();
        JsonRootBean jsonRootBean = gson.fromJson(json, JsonRootBean.class);

        List<Person_Info> person_info = jsonRootBean.getPerson_info();
        System.out.println(person_info.size());
        Person_Info person_info1 = person_info.get(0);
        body_parts body_parts = person_info1.getBody_parts();
        Double score = body_parts.getLeft_knee().getScore();
        System.out.println(score);*/
//        right_knee x = body_parts.getRight_knee();
//        System.out.println(x);
//        List<PersonInfo> personInfo = jsonRootBean.getPersonInfo();
//        System.out.println(jsonRootBean.getLogId());
    }


}