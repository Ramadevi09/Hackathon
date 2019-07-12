package main.java.com.stackroute.polymorphismChallange;

public class VolvoS60 extends Car {
    public VolvoS60(int numberOfCylinders, String cylinderBrand) {
        super(numberOfCylinders, cylinderBrand);
    }
    @Override
    public void startEngine() {
        System.out.println("volvo car engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("volvo car speed increases ");
    }

    @Override
    public void brake() {
        System.out.println("volvo car stop");
    }
}
