package com.inta.common.atom.dao;


import com.inta.common.api.model.User;

import java.util.List;

/**
 * 用户的原子层接口
 */
public interface IUserDao {
    /**
     * 获取用户列表
     *
     * @return List
     */
    List<User> getList();

    /**
     * 用户登录验证
     *
     * @param username
     * @param password
     * @return User
     */
    User login(String username, String password);
}
