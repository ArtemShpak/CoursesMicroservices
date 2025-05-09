package com.teacher.microservice.TeacherMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
public class TeacherMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherMicroserviceApplication.class, args);
	}

}
