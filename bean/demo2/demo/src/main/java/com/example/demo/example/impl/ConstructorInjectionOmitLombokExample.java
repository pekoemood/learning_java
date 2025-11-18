package com.example.demo.example.impl;

import com.example.demo.example.Example;
import com.example.demo.service.SomeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConstructorInjectionOmitLombokExample implements Example {
  private final SomeService someService;

  public void run() {
    someService.doService();
  }
}
