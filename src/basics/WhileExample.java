package src.basics;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String response = "";

     System.out.println("You are in a game, Press \"Q\" to exit");


     //runs the loop till the condition is true || until the condition is false
     while(!response.equals("Q")){
        System.out.print("You are in a loop, Press Q to Exit: ");
        response = scanner.nextLine().toUpperCase();
     }


     //do while loop
     //runs code once and checks the condition
     int number;

     do{
        System.out.print("Enter a number between 1 - 10: ");
        number = scanner.nextInt();
     }while(number < 1 || number > 10);
     System.out.println("You picked "+number);
     
     scanner.close();
    }
}
