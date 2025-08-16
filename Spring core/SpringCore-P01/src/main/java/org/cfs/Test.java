package org.cfs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("beanFactory called");
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("bean file loading");

        System.out.println("sending request ....");
        //by default spring bean create object singleton
        Car car=context.getBean(Car.class);
        Car car1=context.getBean(Car.class);
        System.out.println(car==car1);


        //prototype example
        PetrolEngine pet=context.getBean(PetrolEngine.class);
        PetrolEngine pet1=context.getBean(PetrolEngine.class);
        System.out.println(pet1==pet);


    }
}
