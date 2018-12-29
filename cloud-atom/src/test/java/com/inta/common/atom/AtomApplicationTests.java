package com.inta.common.atom;

import com.inta.common.api.model.User;
import com.inta.common.atom.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AtomApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQuery() throws Exception {
        List<User> users = userMapper.getAll();
        System.out.println(users.toString());
    }

    @Test
    public void testLogin() throws Exception {
        User user = userMapper.login("admin","123456");
        System.out.println(user.toString());
    }

    @Test
    public void testGetUserById() throws Exception {
        User user = userMapper.getUserById(1);
        System.out.println(user.toString());
    }

}
