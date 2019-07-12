package main.java.com.stackroute.polymorphismChallange;

public class HyundaiElantra extends Car {
    public HyundaiElantra(int numberOfCylinders, String cylinderBrand) {
        super(numberOfCylinders, cylinderBrand);
    }

    @Override
    public void startEngine() {
        System.out.println("Hyundai car engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Hyundai car speed increases ");
    }

    @Override
    public void brake() {
        System.out.println("Hyundai car stop");
    }
}



