package com.inta.common.service.controller;


import com.inta.common.api.result.Result;
import com.inta.common.api.result.ResultFactory;
import com.inta.common.service.service.IUserService;
import com.inta.common.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 查询用户列表
     * @return
     */
    @GetMapping("/list")
    public Result getList(){
        List<User> list = userService.getList();
        System.out.println("主服务");
        return ResultFactory.buildSuccessResult(list);
    }

    /**
     * 登录验证
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestParam("username") String username,
                      @RequestParam("password") String password){
        int status = userService.login(username,password);
        return ResultFactory.buildSuccessResult(status);
    }
}
