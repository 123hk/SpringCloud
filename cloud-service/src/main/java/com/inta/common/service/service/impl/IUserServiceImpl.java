package com.inta.common.service.service.impl;

import com.inta.common.api.model.User;
import com.inta.common.service.agency.IUserAgency;
import com.inta.common.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserAgency serviceAgency;

    @Override
    public List<User> getList() {
        List<User> list = serviceAgency.getList();
        return list;
    }

    @Override
    public int login(String s,String s1) {
        User user = serviceAgency.login(s,s1);
        if(!(null == user)){
            return 1;
        }
        return 0;
    }
}
