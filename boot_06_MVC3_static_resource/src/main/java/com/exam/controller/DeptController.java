package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeptController {

	//URL 직접 요청 필요
	//http://localhost:8090/main (기본 컨텍스트명 = / )
	//http://localhost:8090/app/main (컨텍스트명 변경 = /app )
	
	@GetMapping("/main")
	public String main() {
		System.out.println("DeptController>>>");
		return "hello";  // /WEB-INF/views/hello.jsp
	}
}
