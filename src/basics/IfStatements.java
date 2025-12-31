package src.basics;

import java.util.Scanner;


public class IfStatements {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int age;
     
     System.out.print("Enter you age: ");
     age = scanner.nextInt();
      
     if (age>=65) {
        System.out.println("You are an elder!");
     }
     else if(age >=18){
        System.out.println("You are an adult!");
     }
     else if (age>0){
        System.out.println("You are still a child!");
     }
     else if(age ==0){
        System.out.println("You are still a baby");
     }
     else{
        System.out.println("You are not born");
     }

     scanner.close();
    }
}
