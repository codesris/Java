package src.basics;

public class TernaryOperator {
    public static void main(String[] args) {
        //ternary operator ? = Return 1 of 2 values if a condition is true

        //variable = (condition) ? ifTrue: ifFalse;
        
        //replacement to if else statement

        int score = 55;

        // if (score >= 60) {
        //     System.out.println("Pass");
        // }

        String passOrFail = (score>=60) ? "\nThorai" : "\nDherai";
        System.out.println(passOrFail);


        //Check whether the number is even or odd

        int number = 11;

        String evenOrOdd = (number % 2 == 0) ? "\nEven" : "\nOdd";
        System.out.println(evenOrOdd);

        //Check whether the time is A.M. or P.M.

        int onClock = 13;

        String timeOfDay = (onClock<12) ? "\nA.M" : "\nP.M";
        System.out.println(timeOfDay);

        //Tax rate

        int income = 60000;

        double taxRate = (income>=40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
        System.out.println("Test Value: " + 3 * taxRate);
    }
}
