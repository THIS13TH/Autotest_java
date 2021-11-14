package tests;

public class Main {


    public static void main(String[] args){
        Car car = new Car();
        car.markName = "SummerCar";
        car.ageRelease = 1999;
        car.maxVelosity = 190;
        car.kMonOneTank = 400;
        car.weight = 2;


        car.readMarkName(car.markName);
        car.soundMotor();
        System.out.println(car.getMaxVelosity());
    }



}
