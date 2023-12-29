package com.example.inversion_control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication //@configuration,@EnableAutoConfiguration & @ComponentScan
public class InversionControlApplication {

	public static void main(String[] args) {
//		SpringApplication.run(InversionControlApplication.class, args);
		
		//Spring bean container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobilesConfig.class);
		Mobiles obj = context.getBean("getOnePlusObject",Mobiles.class);
		Mobiles obj1 = context.getBean("getIphoneObject",Mobiles.class);
		obj.getModelAndColor();
		obj1.getModelAndColor();
	}

}
