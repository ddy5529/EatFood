package com.ddy.EatFood.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ComponentScan
@Configuration
@Controller
public class HelloController {

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String SayHello() {
        return "indexTemp";
    }
}
