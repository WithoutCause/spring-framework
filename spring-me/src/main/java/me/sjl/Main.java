package me.sjl;

import me.sjl.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
		String id = ctx.getId();
		System.out.println(id);
	}

}
