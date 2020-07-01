package com.example.demo.mapper;

import com.example.demo.model.User;
import com.example.demo.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends MyMapper<User> {
  @Select("select * from user where username=#{username}")
  User selectByName(String username);
}
