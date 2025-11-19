package com.example.demo.aop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
  //@Before("execution(* com.example.demo.service.TargetService.*(..")
  public void beforeAdvice(JoinPoint joinPoint) {
    LocalDateTime startTime = LocalDateTime.now(); //現在の日時を取得
    String formattedTime = startTime.format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS"));
    System.out.println("------[@Before]------");
    System.out.println("Before method:" + joinPoint.getSig)
  }
}
