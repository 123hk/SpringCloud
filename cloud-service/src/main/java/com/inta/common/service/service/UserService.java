package com.inta.common.service.service;

import com.inta.common.api.model.User;
import java.util.List;


public interface UserService {

    List<User> getList();

    int login(String username,String password);
}
