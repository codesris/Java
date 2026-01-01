package src.basics;

import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {
        //Enhanced switches are used when there are too many if else statements

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String dayOfWeek = scanner.nextLine().toLowerCase();
        
        switch (dayOfWeek) {
            case "monday" , "tuesday", "wednesday", "thursday", "friday": System.out.println("It is the weekday.");
            break;
            // case "tuesday" : System.out.println("It is the weekday.");
            // break;
            // case "wednesday" : System.out.println("It is the weekday.");
            // break;
            // case "thursday" : System.out.println("It is the weekday.");
            // break;
            // case "friday" : System.out.println("It is the weekday.");
            // break;
            // case "saturday" : System.out.println("It is the weekend.");
            // break;
            // case "sunday" : System.out.println("It is the weekend.");
            // break;
            case "saturday", "sunday" : System.out.println("It is the weekend.");
            break;

            default: System.out.println(dayOfWeek + " is not a day.");
            break;
                
        }

        scanner.close();
    }
}
