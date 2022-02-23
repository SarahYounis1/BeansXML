package com.example.test1;

public class TrackCoach implements Coach {

 private FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService) {

        this.fortuneService=theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "run twice a day";
    }

    @Override
    public String getDailyFortune() {
        return "Do it : " + fortuneService.getFortune() ;

    }

    // add init method

    public void doMyStartupStuff(){
        System.out.println("Track Coach : Init Method");
    }

    // add destroy method

    public void doMyCleanUpStuff(){
        System.out.println("Track Coach : Destroy Method");

    }

}
