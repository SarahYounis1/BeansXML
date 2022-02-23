package com.example.test1;

public class CricketCoach implements Coach{



    private String email;

    private String team;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    private FortuneService theFortuneService;

    public CricketCoach(){
    System.out.println("NoArg Constructor");
    }

    public void setTheFortuneService(FortuneService theFortuneService) {
        this.theFortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Play pushUps 3 times a day ";
    }

    @Override
    public String getDailyFortune() {
        return this.theFortuneService.getFortune();
    }
}
