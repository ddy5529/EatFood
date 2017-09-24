package com.ddy.EatFood.Controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

    @RequestMapping("/")
    public String Welcome(){
        return "Nice to Meet you ! My name is DDY.Welcome to my word! \n"+
                "If you forger swagger-ui ,you can input webAddress http://localhost:8080/swagger-ui.html";
    }
}
