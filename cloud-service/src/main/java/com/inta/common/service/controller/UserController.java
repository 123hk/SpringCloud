package com.inta.common.service.controller;


import com.inta.common.service.service.UserService;
import com.inta.common.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> getList(){
        List<User> list = userService.getList();
        System.out.println("主服务");
        return list;
    }

    @PostMapping("/login")
    public int login(@RequestParam("username") String username,
                      @RequestParam("password") String password){
        int status = userService.login(username,password);
        return status;
    }
}
