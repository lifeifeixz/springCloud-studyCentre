package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author flysLi
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudServiceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceBApplication.class, args);
	}

}
