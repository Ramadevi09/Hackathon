package main.java.com.stackroute.polymorphismChallange;

public class MainCar {
    public static void main(String[]args){
        Car car=new BMW2Series(4,"BMWSeries");
       car.brake();
       car.accelerate();
       car.startEngine();
        System.out.println(car);
        System.out.println("======================");
        Car car1=new HyundaiElantra(3,"HyundaiSearies");
        car1.startEngine();
        car1.accelerate();
        car1.brake();
        System.out.println(car1);
        System.out.println("========================");
        Car car2=new VolvoS60(2,"volvos60");
        car2.brake();
        car2.accelerate();
        car2.startEngine();
        System.out.println(car2);
    }
}
