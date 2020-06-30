package com.example.demo.dubbo.impl;

import com.example.demo.dubbo.TestProviderService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(version="1.0.0")
public class TestProviderServiceImpl implements TestProviderService {
  public String Hello(String who) {
    return "Hello world ! Dear Programer " + who ;
  }
}
