package com.inta.common.atom.mapper;


import com.inta.common.api.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "username",  column = "username")    //当属性名称与表名不一致时，必须加上@result，说明对象属性与表字段的对应关系
    })
    List<User> getAll();

    @Select("SELECT * from `user` where username = #{username} and `password` = #{password}")
//    @Results({
//            @Result(property = "username",  column = "username"),
//            @Result(property = "password",  column = "password")
//    })
    User login(@Param("username") String username, @Param("password") String password); //多入参时，必须加上@param注解

    @Select("SELECT * FROM user where id = #{id}")  //单个参数时，可以不加@param注解
    User getUserById(int id);
}
