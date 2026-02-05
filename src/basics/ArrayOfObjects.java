package src.basics;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        Car[] cars = {car1, car2, car3};
    
        for(Car car : cars){
            //read it as, for each car of Car object from arrays of cars do the following
            car.drive();
        };

        System.out.println();

        //Another way
        Car[] carx = {new Car("Mustang", "Red"),
                    new Car("Corvette", "Blue"),
                    new Car("Charger", "Yellow")};

        for(Car car : carx){
            car.drive();
        }
    }

}