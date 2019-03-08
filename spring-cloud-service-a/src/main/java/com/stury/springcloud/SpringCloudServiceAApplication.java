package com.stury.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author flysLi
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceAApplication.class, args);
	}

}
