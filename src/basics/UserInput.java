package src.basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // this line helps prevents the error occured by taking "\n" by pressing "Enter" after typing age. 
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Your are "+age+ " years old.");
        System.out.print("Your name is "+name);


        scanner.close();
    }
}
