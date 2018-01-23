package com.ddy.EatFood.Controller;

import com.ddy.EatFood.Server.SearchInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/*
*  @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }
    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
* */

//@Controller 注解需要配合@ResponseBody这个类来配合使用
@RestController
@RequestMapping("/search")
public class SearchController {

    @Value("${ddy.name}")
    private String ddy_name;

    @Autowired
    private SearchInfo searchInfo;

    @RequestMapping(value = "/getWaterInfo/{water_name}",method = RequestMethod.POST)
    public String Search(@PathVariable("water_name") String water_name){

        return searchInfo.getInfo(water_name);
    }

    //以下为遵循springboot（RESTful风格）的接口的写法
    //localhost:8060/search/getDdy_name/hello
    @RequestMapping(value = "/getDdy_name/{get_ddy_name}",method = RequestMethod.GET)
    public String getDdy_name(@PathVariable("get_ddy_name") String get_ddy_name){

        return ddy_name+get_ddy_name;
    }

    //以下为传统的get传参的方法
    //localhost:8060/search/getDdy_name2?dname=ddy5529
    @RequestMapping(value = "/getDdy_name2",method = RequestMethod.GET)
    public String getDdy_name2(@RequestParam("dname") String myName){//这个两个值不需要一致，会在spring boot中会对两个参数进行映射

        return "name："+myName;
    }

    //以下为上一种的进阶版本，即给传入的值赋予初值
//    @GetMapping  这是一种组合注解，即限定方法的类型 类似的还有 PutMapping,PostMapping等7种方式
    @RequestMapping(value = "/getDdy_name21",method = RequestMethod.GET)
    public String getDdy_name21(@RequestParam(value="dname",required = false,defaultValue = "me") String myName){//这个两个值不需要一致，会在spring boot中会对两个参数进行映射

        return "name："+myName;
    }
}
