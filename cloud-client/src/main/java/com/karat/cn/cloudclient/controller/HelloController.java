package com.karat.cn.cloudclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author L
 * @date 2019/10/11.
 */
@RestController
public class HelloController {


    @Value("${server.port}")
    String port;


    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi" + name + " ,i am from port:" + port;
    }


}
