package src.basics;

class Animal {
    void move(){
        System.out.println("This animal is running.");
    }
}

class Doggo extends Animal{

}

class Kitty extends Animal{

}

class Fish extends Animal{
    @Override
    void move(){
        System.out.println("This animal is swimming.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        //  Method Overriding = When a subclass provied its own
        //                      implementation of a method that is already defined.
        //                      Allows for code reusability and give specific           implementations.

        Doggo dog = new Doggo();
        Kitty cat = new Kitty();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
    
}
