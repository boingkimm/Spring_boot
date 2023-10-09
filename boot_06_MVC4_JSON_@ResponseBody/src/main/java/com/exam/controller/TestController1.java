package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController1 {

	//http://localhost:8090/app/main
	
	//@ResponseBody
	
//	@GetMapping("/main")
//	public String main() {
//		System.out.println("TestController");
//		return "hello";  //뷰로 인식 /WEB-INF/views/hello.jsp 
//	}

	@GetMapping("/main2")
	@ResponseBody
	public String main2() {
		System.out.println("TestController");
		return "hello~~";  //리턴값 문자열을 그대로 출력 hello~~
	}

	
}
