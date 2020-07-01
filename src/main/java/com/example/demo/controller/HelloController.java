package com.example.demo.controller;

import com.example.demo.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.mapper.UserMapper;

@RestController
@RequestMapping("/hello")
@MapperScan("com.example.demo.mapper")
public class HelloController {
  @Autowired
  private UserMapper mapper;

  @RequestMapping("/index")
  public String index() {
    return "hello spring boot 2.0!";
  }

  @RequestMapping("/searchUser")
  public User searchUser(String username) {
    User user = mapper.selectByName(username);
    return user;
  }
}
