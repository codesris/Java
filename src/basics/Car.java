package src.basics;

public class Car {
    String model;
    String color;

    Car(String model, String color){
        this.color = color;
        this.model = model;
    }

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
