package org.maker.controller;


import org.maker.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/dubbotest")
    public String demo(){
        String str = "emmmmm";
        String result = testService.demo(str);
        System.out.print(result);
        return null;
    }

}
