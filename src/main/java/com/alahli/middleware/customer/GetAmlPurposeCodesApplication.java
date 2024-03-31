package com.alahli.middleware.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.alahli.middleware.customer.*")
@ImportResource({"classpath:spring/camel-context.xml"})
public class GetAmlPurposeCodesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetAmlPurposeCodesApplication.class, args);
	}

}
