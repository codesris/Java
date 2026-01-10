package src.basics;

import java.util.Scanner;

public class UserInputArrays {
    public static void main(String[] args) {
        //VARIABLES
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("What # of foods do you want?: ");
        size = scanner.nextInt();

        String[] foods = new String[size]; 
        scanner.nextLine();

        System.out.println();

        //LOOP
        for(int i = 0; i < foods.length; i++){
            System.out.printf("Enter a food [%d]: ",i);
            foods[i] = scanner.nextLine();
        }
        System.out.println();

        //DISPLAY OUTPUT
        for(String food : foods){
            System.out.println(food);
        }


        scanner.close();
    }
}
