package com.ddy.EatFood.Controller;

import com.ddy.EatFood.Model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class PersonController {
//    @RequestMapping(value = "/search",produces = (MediaType.APPLICATION_JSON_VALUE))
//    public Person search(){
//        return new Person("猪八戒",11529,"大唐");
//    }
}
