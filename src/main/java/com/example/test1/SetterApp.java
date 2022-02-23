package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {

    public static void main(String[] args) {
        //load spring context file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/applicationContext.xml");
       // retrieve bean from the spring container
        CricketCoach theCoach= context.getBean("MyCricketCoach",CricketCoach.class);
        //call the methods
       System.out.println(theCoach.getDailyWorkout());
       System.out.println(theCoach.getDailyFortune());
       System.out.println(theCoach.getEmail());
       System.out.println(theCoach.getTeam());
       //close the context
        context.close();


    }

}
