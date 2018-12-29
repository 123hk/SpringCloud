package com.inta.common.atom.controller;

import com.inta.common.api.feign.IUser;
import com.inta.common.api.model.User;
import com.inta.common.atom.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户原子的访问控制
 */
@RestController
public class UserController implements IUser {

    @Autowired
    private IUserDao userDao;

    /**
     * 获取用户列表
     * @return List
     */
    public List<User> getList() {
        return userDao.getList();
    }

    /**
     * 用户登录验证
     * @param username
     * @param password
     * @return User
     */
    public User login(@RequestParam("username") String username,
                      @RequestParam("password") String password) {
        return userDao.login(username,password);
    }



}
