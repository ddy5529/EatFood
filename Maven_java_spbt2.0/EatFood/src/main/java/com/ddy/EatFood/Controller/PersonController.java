package com.ddy.EatFood.Controller;

import com.ddy.EatFood.Model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class PersonController {
    /*
    * produces可能不算一个注解，因为什么呢，它是注解@requestMapping注解里面的属性项，
    * 它的作用是指定返回值类型，不但可以设置返回值类型还可以设定返回值的字符编码；
    */
    @RequestMapping(value = "/getZBJ",produces = (MediaType.APPLICATION_JSON_VALUE),method = RequestMethod.GET)
    public Person search(){
        return new Person("猪八戒",11529,"大唐");
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/say2", "/say4"})
    public String SayHello2() {
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/say3")
    public String SayHello3() {
        return "雷  猴  啊";
    }
}
