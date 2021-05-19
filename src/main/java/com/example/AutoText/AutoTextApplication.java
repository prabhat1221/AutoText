package com.example.AutoText;

import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


import com.example.AutoText.entity.ConstantsClass;
import com.example.AutoText.service.AlertService;
@SpringBootApplication
@EnableScheduling
public class AutoTextApplication {
	
	//static  AlertService alertService = new AlertService();

	public static void main(String[] args) throws URISyntaxException {
		
		//alertService.post(ConstantsClass.BOT_URL, "Hi Bye from spring boot");
		SpringApplication.run(AutoTextApplication.class, args);
	}
}
