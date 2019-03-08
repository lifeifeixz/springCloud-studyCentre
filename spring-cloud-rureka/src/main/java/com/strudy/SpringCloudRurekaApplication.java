package com.strudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author flysLi
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudRurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRurekaApplication.class, args);
	}

}
