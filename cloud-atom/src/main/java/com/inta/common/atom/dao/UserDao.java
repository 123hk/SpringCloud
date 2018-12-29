package com.inta.common.atom.dao;


import com.inta.common.api.model.User;
import java.util.List;

public interface UserDao {

    List<User> getList();

    User login(String username,String password);
}
