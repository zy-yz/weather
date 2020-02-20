package com.zy.microweathereurekaserver.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    //@RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}