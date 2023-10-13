package com.exam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.exam.interceptor.MyHandlerInterceptor;

@Configuration  //servlet-context.xml 역할 (설정 정보)
public class WebConfig implements WebMvcConfigurer {

	/*
	 *servlet-context.xml
	 * 	<mvc:interceptor>
			<mvc:mapping path="/loginCheck/*"/>
			<ref bean="xxx"/>
		</mvc:interceptor>
	 */
		
	@Autowired
	MyHandlerInterceptor interceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor)  //<ref bean="xxx"/>
				.addPathPatterns("/login", "/mypage");   //login,mypage 요청 시 HandlerInterceptor 동작
	}
	
	
	
	
	/*
	  <mvc:view-controller path="/mypage" view-name="main"/>
	*/
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/mypage")   //요청 시
				.setViewName("main");           //인터셉터 걸린 후 메인으로 감
	}
	
	
	
}
