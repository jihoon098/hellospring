package kr.co.itcen.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/* @SpringBootApplication어노테이션 :
 * 
 * 		@SpringBootApplication어노테이션은
 * 		@SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan("kr.co.itcen.hellospring.controller")
 * 		위 3가지의 어노테이션을 한꺼번에 처리하는 어노테이션이다.
 * 
 */


@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("kr.co.itcen.hellospring.controller")
public class BootApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
