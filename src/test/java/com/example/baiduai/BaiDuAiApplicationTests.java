package com.example.baiduai;

import com.example.baiduai.BaiduAi.BaiduAi;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BaiDuAiApplicationTests {

    @Autowired
    BaiduAi baiduAi;

/*    @Test
    void contextLoads() {
        boolean b = baiduAi.get();
        System.out.println(b);
    }*/

}
