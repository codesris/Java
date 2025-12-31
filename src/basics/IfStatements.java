package src.basics;

import java.util.Scanner;


public class IfStatements {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int age;
     boolean isStudent;
     
     System.out.print("Enter you age: ");
     age = scanner.nextInt();

    System.out.print("Are you a studentn (true/false)?: ");
     isStudent = scanner.nextBoolean();
      
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

     //Boolean
     if (isStudent) {
        System.out.println("So, you are a Student!");
     }
     else{
        System.out.println("So, you're not a student");
     }
     scanner.close();
    }
}
