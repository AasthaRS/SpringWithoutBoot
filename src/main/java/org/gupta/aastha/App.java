package org.gupta.aastha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");   // create container
        Dev dev = (Dev)context.getBean("dev");
        //System.out.println(dev.getAge());
        dev.build();
    }

}
