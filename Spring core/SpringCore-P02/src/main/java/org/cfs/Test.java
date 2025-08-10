package org.cfs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("beanFactory called");
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("bean file loading");

        System.out.println("sending request ....");
        Car car=context.getBean(Car.class);
        car.drive();


    }
}
