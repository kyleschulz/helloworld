package com.fcsa.helloworld.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String hello() {
        return "Hello My Good Old Buddy Old Pal!";
    }
}