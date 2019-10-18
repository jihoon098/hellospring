package kr.co.itcen.hellospring.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import kr.co.itcen.hellospring.config.WebConfig;


/*
 * 1. 톰캣은 ServletContainerInitializer인터페이스를 구현하는 클래스를 찾아서 있다면 web.xml대신에 초기화하는데 사용함.
 * 2. Spring-MVC는 ServletContainerInitializer을 구현한 SpringServletContainerInitializer클래스를 제공. 내부적으로 실행됨.
 * 3. AbstractAnnotationConfigDispatcherServletInitializer 클래스를 상속 
 * 	    또는 WebApplicationInitializer인터페이스를 구현한 클래스가 설정파일로 등록됨.
 * 
 */
public class SpringWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {WebConfig.class};
		//와일드카드..배열로
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
