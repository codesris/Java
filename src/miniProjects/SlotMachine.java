package src.miniProjects;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        //  JAVA SLOT MACHINE
            
        //  DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;
        
        //  DISPLAY WELCOME MESSAGE
        System.out.println("Welcome to JAVA slots");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐ \n");
        
        //  PLAY IF BALANCE > 0
        while (balance > 0) {
            System.out.println("\nCurrent balance: $"+balance);

            //  ENTER BET AMOUNT
            System.out.print("\nPlace your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            //  VERIFY IF BET > BALANCE
            if (bet > balance) {
                System.out.println("\nInsufficent Balance.");
                continue;
            }

            //  VERIFY IF BET > 0
            else if (bet <= 0) {
                System.out.println("Bet must be greater than 0.");
                continue;
            }

            // SUBTRACT BET FROM BALANCE
            else{
                balance -= bet;
            }

            //  SPIN ROW
            System.out.println("\nSpinning...");
            row = spinRow();

            //  PRINT ROW
            printRow(row);
            
            
            //  GET PAYOUT
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $"+ payout);
                balance += payout;
            }
            else{
                System.out.println("\nSorry you lost this round!");
            }


            //  ASK TO PLAY AGAIN
            System.out.print("\nDo you want to play again (Y/N)?: ");
            playAgain = scanner.nextLine().toUpperCase();


            if (!playAgain.equals("Y")) {
                break;
            }
        }
        
        
        //  EXIT MESSAGE
        System.out.println("\nYou started at $100.");
        System.out.println("You are now at $"+balance);

        if (balance <= 0) {
            System.out.println("\nYou seriously need to STOP Gambling.");
        }

        System.out.println("\nThank You for Playing!!!\n");


        scanner.close();
    }

    //  spinRow method()
    static String[] spinRow(){
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    //  printRow method()
    static void printRow(String[] row){
        System.out.println("--------------");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("--------------");
    }

    //  getPayout method()
    static int getPayout(String[] row, int bet){
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
            
        }
        else if (row[0].equals(row[1])) {
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

        else if (row[1].equals(row[2])) {
            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

        return 0;
    }

}
