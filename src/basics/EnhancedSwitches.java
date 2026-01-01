package src.basics;

import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {
        //Enhanced switches are used when there are too many if else statements
        //availabe from java +14

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String dayOfWeek = scanner.nextLine().toLowerCase();
        

        //Old switch case example
        switch (dayOfWeek) {

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


            //shortened
            case "monday" , "tuesday", "wednesday", "thursday", "friday": System.out.println("It is the weekday.");
            break;

            case "saturday", "sunday" : System.out.println("It is the weekend.");
            break;

            default: System.out.println(dayOfWeek + " is not a day.");
            break;
                
        }

        //Enhanced Switch example
        switch (dayOfWeek) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                System.out.println("Weekday");

            case "saturday", "sunday" ->
                System.out.println("Weekend");

            default ->
                System.out.println("Invalid");
        }


        scanner.close();
    }
}
