package com.eurakaserver.Devilal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Conditional;

@SpringBootApplication
@EnableEurekaServer
public class DevilalEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevilalEurekaServerApplication.class, args);
	}

}
