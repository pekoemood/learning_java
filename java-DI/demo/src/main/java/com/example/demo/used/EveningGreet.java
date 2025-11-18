package com.example.demo.used;

import org.springframework.stereotype.Component;

public class EveningGreet implements Greet {
  @Override
  public String greeting() {
    return "こんばんは";
  }
}
