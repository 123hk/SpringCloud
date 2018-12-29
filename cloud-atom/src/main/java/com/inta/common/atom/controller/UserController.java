package com.inta.common.atom.controller;

import com.inta.common.api.feign.IUser;
import com.inta.common.api.model.User;
import com.inta.common.atom.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController implements IUser {

    @Autowired
    private UserDao userDao;

    public List<User> getList() {
        return userDao.getList();
    }

    public User login(@RequestParam("username") String username,
                      @RequestParam("password") String password) {
        return userDao.login(username,password);
    }



}
