package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("/BeanLifeCycle_applicationContext.xml");

        Coach theCoach = context.getBean("MyCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
