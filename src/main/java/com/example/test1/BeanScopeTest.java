package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTest {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/BeanScope_applicationContext.xml");

        Coach theCoach = context.getBean("MyCoach" , Coach.class);

        Coach theCoach1 = context.getBean("MyCoach" , Coach.class);

     //check if the same
         boolean result = (theCoach == theCoach1);
         System.out.println("The result is " + result);
         System.out.println("The memory location for the coach " + theCoach );
        System.out.println("The memory location for the coach1 " + theCoach1 );

    }
}
