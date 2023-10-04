package com.exam;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.exam.service.DeptServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("BootTemplateApplication 실행");
		ApplicationContext ctx = SpringApplication.run(Application.class, args); //run메서드를 리턴해주는 

		DeptServiceImpl service = ctx.getBean("xxx", DeptServiceImpl.class);
		List<String> list = service.list();
		System.out.println(list);

		
	}

}
