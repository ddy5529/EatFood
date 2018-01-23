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
import org.springframework.web.bind.annotation.*;

@ComponentScan
@Configuration
@Controller
public class HelloController {

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String SayHello() {
        return "indexTemp";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/say2")
    public String SayHello2() {
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/say3")
    public String SayHello3() {
        return "雷  猴  啊";
    }

//    @Autowired
//    private TransportClient client;
//
//    @GetMapping("/get/book/novel")
//    @ResponseBody
//    public ResponseEntity get(@RequestParam(name = "id",defaultValue = "")String id ){
//        if (id.isEmpty()){
//            return new ResponseEntity(HttpStatus.NOT_FOUND  );
//        }
//        GetResponse response=this.client.prepareGet("book","novel",id)
//                .get();
//        if (!response.isExists()){
//            return new ResponseEntity(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity(response.getSource(), HttpStatus.OK);
//    }
}
