package main.java.com.stackroute.polymorphismChallange;

 class BMW2Series extends Car {
     //private String carNumber;

     public BMW2Series( int numberOfCylinders,String cylinderBrand) {
         super( numberOfCylinders, cylinderBrand);
     }

     @Override
     public void startEngine() {
         System.out.println("BMWSeries car engine started");
     }

     @Override
     public void accelerate() {
         System.out.println("BMWSeries car speed increases ");
     }

     @Override
     public void brake() {
         System.out.println("BMWSeries car stop");
     }
 }
