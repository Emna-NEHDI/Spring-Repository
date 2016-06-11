package org.emnanehdi.learning.core;

import org.emnanehdi.learning.config.ApplicationConfig;
import org.emnanehdi.learning.hello.HelloWorld;
import org.emnanehdi.learning.hello.Party;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(
		ApplicationConfig.class);

	HelloWorld obj = (HelloWorld) context.getBean("helloBean");
	obj.printMessage("Spring3 Java Config");

	Party party = (Party) context.getBean("Party");
	party.dance("salsa");
    }
}
