package com.ddy.EatFood.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wx")
public class WeiXinController {

    @GetMapping()
    public String getMessage(){
        return "hello,word";
    }
}
