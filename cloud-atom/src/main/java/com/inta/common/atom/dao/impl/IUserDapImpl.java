package com.inta.common.atom.dao.impl;

import com.inta.common.atom.mapper.UserMapper;
import com.inta.common.api.model.User;
import com.inta.common.atom.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户的原子层实现
 */
@Service
public class IUserDapImpl implements IUserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getList() {
        return userMapper.getAll();
    }

    @Override
    public User login(String username, String password) {
        return userMapper.login(username,password);
    }
}
