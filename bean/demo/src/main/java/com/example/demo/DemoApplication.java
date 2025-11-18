package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.BusinessLogic;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args).getBean(DemoApplication.class).exe();
	}

	/** DI */
	@Autowired
	@Qualifier("test")
	private BusinessLogic business1; //TestLogicImplのインスタンス

	/** DI */
	@Autowired
	@Qualifier("sample")
	private BusinessLogic business2; //SampleLogicImplのインスタンス

	/** 実行メソッド */
	public void exe() {
		business1.doLogic();
		business2.doLogic();
	}

}
