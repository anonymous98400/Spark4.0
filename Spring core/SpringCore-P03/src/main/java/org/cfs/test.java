package org.cfs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        Motor m=context.getBean(Motor.class);
        m.doWork();


        context.close(); //destroyed method calling way
    }
}
