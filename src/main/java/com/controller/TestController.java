package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(path = "/mvc/testmvc")
    public String testmvc1() {
        return "testmvc1";
    }
}
