package com.exam.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.dto.DeptDTO;

//@Controller
@RestController
public class TestController {
   
	//http://localhost:8090/app/
	
	/*
	 * @RestController
	 *  = @Controller + @ResponseBody
	 * 
	 * 모든 메서드에 @ResponseBody 전부 적용할 때만 가능!
	 *  Spring Framework 및 Spring Boot 모두 사용 가능
	 */
	
	//1. String 반환
	@GetMapping(value = "/aaa", produces = "text/plain;charset=utf-8")
	public String aaa() {
		return "홍길동";
	}
	
	//2. DeptDTO 반환 (JSON)
	@GetMapping(value = "/bbb")
	public DeptDTO bbb() {
		DeptDTO dto = new DeptDTO(10, "개발", "서울");
		return dto;
	}
	
	//3. List 반환 (JSON)
	@GetMapping(value = "/ccc")
	public ArrayList<DeptDTO> ccc() {
		ArrayList<DeptDTO> list = new  ArrayList<DeptDTO>();
		list.add(new DeptDTO(10, "개발1", "서울"));
		list.add(new DeptDTO(20, "개발2", "서울"));
		list.add(new DeptDTO(30, "개발3", "서울"));
		return list;
	}
	
	//4. html 반환
	@GetMapping(value = "/ddd", 
			produces = "text/html;charset=utf-8")
	public String ddd() {
		return "<html><body><h1>Hello</h1></body></html>";
	}
	
	//5. xml 반환
	@GetMapping(value = "/eee", 
			produces = "text/xml;charset=utf-8")
	public String eee() {
		return "<person><name>홍길동</name><age>20</age></person>";
	}
	
}
