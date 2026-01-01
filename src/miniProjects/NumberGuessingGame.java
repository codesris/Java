package src.miniProjects;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the scanner and avoid warnings
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            // Initialize variables to avoid "might not have been initialized" errors
            int n, guess, randomNumber;
            int attempts = 0;

            System.out.println("--- Number Guessing Game ---");
            
            // 1. Ask for 'n' FIRST
            System.out.print("Enter the maximum value (n): ");
            n = scanner.nextInt();

            // 2. Generate the random number AFTER getting 'n'
            // nextInt(origin, bound) generates from origin (inclusive) to bound (exclusive)
            randomNumber = random.nextInt(1, n + 1);

            do {
                System.out.print("Enter your guess between 1 - " + n + ": ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < randomNumber) {
                    System.out.println("Try HIGHER");
                } else if (guess > randomNumber) {
                    System.out.println("Try LOWER");
                } else {
                    System.out.println("BINGO!");
                }

            } while (guess != randomNumber);

            System.out.println("You won in " + attempts + " attempts!");
        } 
    }
}
