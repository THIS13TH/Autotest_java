package tests;

public class Car {

    String markName;
    int ageRelease;
    int maxVelosity;
    int weight;
    int kMonOneTank;


    void readMarkName(String markName){
        System.out.println(markName);
    }
    void soundMotor(){
        System.out.println("Vrrrrrrrr-Vrrrrrrr");
    }
    int getMaxVelosity(){
        return maxVelosity;
    }

}
