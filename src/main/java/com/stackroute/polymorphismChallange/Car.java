package main.java.com.stackroute.polymorphismChallange;

public class Car {


    private boolean engine;
    private int numberOfCylinders,wheels;
    private String cylinderBrand;



    public Car(int numberOfCylinders, String cylinderBrand) {
        this.engine = true;
        this.numberOfCylinders = numberOfCylinders;
        this.wheels = 4;
        this.cylinderBrand = cylinderBrand;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public void setCylinderBrand(String cylinderBrand) {
        this.cylinderBrand = cylinderBrand;
    }
    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public String getCylinderBrand() {
        return cylinderBrand;
    }
    public void startEngine(){
        System.out.println("car engine started");
    }
    public void accelerate(){
        System.out.println("speed increases");
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", numberOfCylinders=" + numberOfCylinders +
                ", wheels=" + wheels +
                ", cylinderBrand='" + cylinderBrand + '\'' +
                '}';
    }

    public void brake(){
        System.out.println("stop the car");
    }


}
