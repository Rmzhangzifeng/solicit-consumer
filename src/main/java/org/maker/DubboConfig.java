package org.maker;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ "classpath:spring-dubbo-consumer.xml" })
public class DubboConfig {

}