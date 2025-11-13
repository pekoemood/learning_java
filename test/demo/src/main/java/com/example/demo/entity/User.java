package com.example.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
  private String name;
  private int age;

  public static void main(String[] args) {
    User user = new User("taro", 30);
    System.out.println(user.getName());
    System.out.println(user.hashCode());
  }
}