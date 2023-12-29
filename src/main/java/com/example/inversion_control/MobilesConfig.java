package com.example.inversion_control;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MobilesConfig {
	@Bean
	@Scope("prototype") //by default bean has the singleton scope  prototype showing a new instance for each request
	public Mobiles getOnePlusObject() {  // inplace of Mobiles we can use OnePlus or Iphone
		return new OnePlus();  // return an instance of OnePlus class
	}
	@Bean
	public Mobiles getIphoneObject() {
		return new Iphone(); //return an instance of Iphone class
	}
}
