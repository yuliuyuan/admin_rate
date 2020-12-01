package com.yisheng.zzu.controller;


import com.yisheng.zzu.pojo.User;
import com.yisheng.zzu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String helloworld(){
        System.out.println("hello world");
        return "hello world";
    }


    @RequestMapping(value="/get1/{id}",method= RequestMethod.GET)
    public String selectAll1(@PathVariable("id") Integer id){
        return "hello"+id;
    }

    @RequestMapping("/get2")
    @ResponseBody
    public List<User> selectAll2(){
        return userService.selectAll();
    }
}
