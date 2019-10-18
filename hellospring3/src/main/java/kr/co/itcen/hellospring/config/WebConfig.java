package kr.co.itcen.hellospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/*
 * @EnableWebMvc:
 * 이 어노테이션 한줄의 기능은.
 * xml설정법과 비교해서보자면, <mvc: ~~~ >가 붙는 혹은 해당 태그 내에 등록하는 
 * validator, interceptors, conversionService, messageConverter등의 모든 설정들을 자동으로 만들어주는 역할을 한다.
 * 
 */

@Configuration
//@EnableWebMvc
@ComponentScan({"kr.co.itcen.hellospring.controller"})
public class WebConfig {
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		//viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setExposeContextBeansAsAttributes(true);
	
		return viewResolver;
	}
	
	
	
	
	
}
