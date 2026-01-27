package src.basics;

public class OOP {
    //Object = An entity that holds data (attributes)
    //         and can perform actions (methods)
    //         It is a reference data type

    public static class Car{
        String make = "Ford";
        String model = "Mustang";
        int year = 2025;
        double price = 58000.99;
        boolean isRunning = true;

        void start(){
            isRunning = true;
            System.out.println("You start the engine.");
        }

        void stop(){
            isRunning = false;
            System.out.println("You stop the engine.");
        }

        void drive(){
            System.out.println("You drive the model " + model);
        }

        void brake(){
            System.out.println("You brake the " + model);
        } 
    }

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        System.out.println();

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.drive();
        car.brake();
        car.stop();
        System.out.println(car.isRunning);
    }
}
