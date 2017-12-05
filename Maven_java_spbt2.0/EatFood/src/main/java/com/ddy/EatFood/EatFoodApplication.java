package com.ddy.EatFood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableTransactionManagement  //开启事务管理
@SpringBootApplication
//@ComponentScan(basePackages={"com.ddy.EatFood.Model.Entity"})
public class EatFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(EatFoodApplication.class, args);

	}
}
