package me.sjl.config;

import me.sjl.bean.Person;
import me.sjl.bean.Person1;
import me.sjl.bean.Person2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public Person2 person2() {
		return new Person2();
	}

	@Bean
	public Person1 person1() {
		return new Person1();
	}

	@Bean
	public Person person() {
		return new Person();
	}

}
