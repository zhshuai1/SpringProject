package com.zebrait.chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IPhoneConfiguration {
	@Bean
	public MobilePhone iphone4s(){
		return new Apple();
	}
}
