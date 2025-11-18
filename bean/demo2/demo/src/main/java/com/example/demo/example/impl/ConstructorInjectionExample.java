package com.example.demo.example.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.example.Example;
import com.example.demo.service.SomeService;

public class ConstructorInjectionExample implements Example {
  private final SomeService someService;

  @Autowired
  public ConstructorInjectionExample(SomeService someService) {
    this.someService = someService;
  }


  public void run() {
    someService.doService();
  }
}
