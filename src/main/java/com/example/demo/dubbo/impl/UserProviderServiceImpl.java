package com.example.demo.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.dubbo.UserProviderService;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version="1.0.0")
@MapperScan("com.example.demo.mapper")
public class UserProviderServiceImpl implements UserProviderService {
  @Autowired
  private UserMapper mapper;

  public String SearchUser(String username) {
    User user = mapper.selectByName(username);
    return user.toString();
  }
}
