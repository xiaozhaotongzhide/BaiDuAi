package com.example.baiduai.Controller;

import com.example.baiduai.BaiduAi.BaiduAi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    BaiduAi baiduAi;

    @GetMapping("get")
    public String get() {
        boolean b = baiduAi.get();
//        System.out.println(b);
        return b + "";
    }
    @GetMapping("get1")
    public String get1() {
        boolean b = false;
        return b + "";
    }
}
