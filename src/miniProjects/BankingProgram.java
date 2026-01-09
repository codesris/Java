package src.miniProjects;

import java.util.Scanner;

public class BankingProgram {
    //Global scanner
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {        
        //  JAVA BANKING PROGRAM

        //  VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;


        while (isRunning) {
        //  DISPLAY MENU

        System.out.println();
        System.out.println("BANKING PROGRAM\n");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("\nEnter your choice (1-4): ");
        choice = scanner.nextInt();

        // GET AND DISPLAY USER CHOICES
        switch (choice) {
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdraw(balance);
            case 4 -> {
                isRunning = false;
                exit();
            }
            default -> System.out.println("\nInvalid input");
        }   
        }        
        scanner.close();
    }
        // showBalance()
        static void showBalance(double balance){
            System.out.printf("\n$%.2f\n",balance);
        }

        // deposit()
        static double deposit(){
            double amount;

            System.out.print("\nEnter an amount to be deposited: ");
            amount = scanner.nextDouble();

            if (amount < 0) {
                System.out.println("\nAmount can't be negative");
                return 0;
            }
            else{
                return amount;
            }
        }

        //  withdraw()
        static double withdraw(double balance){
            double amount;

            System.out.print("\nEnter an amount to be withdrawn: ");
            amount = scanner.nextDouble();

            if (amount > balance) {
                System.out.println("\nINSUFFICIENT FUNDS");
                return 0;
            }
            else if (amount < 0) {
                System.out.println("\nAmount can't be negative");
                return 0;
            }
            else{
                return amount;
            }
        }

        //  EXIT MESSAGE;
        static void exit(){
            System.out.println("\nTHANK YOU! Have a nice day!!\n");
        }
}
