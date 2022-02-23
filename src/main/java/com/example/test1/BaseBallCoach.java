package com.example.test1;

public class BaseBallCoach implements Coach{
  //private filed for dependency ]
  private FortuneService fortuneService;
  //constructor for dependency injection
    public BaseBallCoach(FortuneService theFortuneService ) {
        this.fortuneService= theFortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return "spending 20 min doing planks";
    }

    @Override
    public String getDailyFortune() {
        //use fortuneService to get fortune
        return fortuneService.getFortune();
    }
}
