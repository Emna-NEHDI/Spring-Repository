package org.emnanehdi.learning.config;

import org.emnanehdi.learning.hello.HelloWorld;
import org.emnanehdi.learning.hello.impl.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*
 * the @Configuration annotation  indicates that the class 
 * can be used by the Spring IoC container as a source of bean definitions
 */
@Configuration
@Import({ CoreModuleConfig.class })
public class ApplicationConfig {
    /*
     * The @Bean annotation tells Spring that this method will return an object
     * that should be registered as a bean in the Spring application context
     */
    @Bean(name = "helloBean")
    public HelloWorld helloWorld() {
	return new HelloWorldImpl();
    }
}
