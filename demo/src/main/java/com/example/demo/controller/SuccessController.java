package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuccessController {

    /**
     * 处理GET请求，返回"success"字符串
     * @return "success"
     */
    @GetMapping("/success")
    public String getSuccess() {
        return "success Ai Test";
    }
}