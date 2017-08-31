package com.ddy.EatFood.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String SayHello() {
        return "hi,my name is ddy";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/say2")
    public String SayHello2() {
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/say3")
    public String SayHello3() {
        return "雷  猴  啊";
    }
}
