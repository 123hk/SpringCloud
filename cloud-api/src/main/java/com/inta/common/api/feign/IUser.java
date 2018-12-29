package com.inta.common.api.feign;

import com.inta.common.api.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface IUser {

    @GetMapping("/list")
    List<User> getList();

    @PostMapping("/login")
    User login(@RequestParam("username") String username,
               @RequestParam("password") String password);
}
