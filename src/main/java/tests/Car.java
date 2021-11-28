package tests;

public class Car {


    // Переменные, свойства, состояние
    String markName;
    int ageRelease;
    int maxVelosity;
    int weight;
    int kMonOneTank;


    // Функции, методы, поведение
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
