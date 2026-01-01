package src.miniProjects;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the pricipal: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate (%): ");
        rate = scanner.nextDouble() /100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded * years);

        System.out.printf("You've made $%,.2f over the period of %d years",amount,years);
        
        scanner.close();
    }
}
