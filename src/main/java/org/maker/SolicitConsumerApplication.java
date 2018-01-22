package org.maker;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"org.maker"})
public class SolicitConsumerApplication {
	private static Logger logger = Logger.getLogger(SolicitConsumerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SolicitConsumerApplication.class, args);
		logger.info("============= SpringBoot Start Success =============");
	}
}
