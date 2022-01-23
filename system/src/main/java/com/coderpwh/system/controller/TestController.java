package com.coderpwh.system.controller;


import com.coderpwh.server.domain.Test;
import com.coderpwh.server.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private TestService testService;
    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("testlist")
    public List<Test> testList() {
        return testService.testList();
    }
}
