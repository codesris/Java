package src.miniProjects;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //  JAVA QUIZ GAME


        // QUESTIONS array[]
        String[] questions = {"What is the main function of a router?",
                            "\nWhich part of the computer is considered the brain?",
                            "\nWhat year was the facebook launched?",
                            "\nWho is known as the father of computer?",
                            "\nWhat was the first programming language?"};

        //  OPTIONS array[]
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet", "4. Managing passwords"},
                            {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                            {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                            {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                            {"1. COBOL", "2. C", "3. Fortan", "4. Assembly"}};

        //  DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        int[] answers = {3, 1, 2, 4, 3};
        int guess, score = 0;

        //  WELCOME MESSAGE
        System.out.println("\nWelcome to the JAVA QUIZ GAME.\n");

        //  QUESTION loop
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }
            // GET GUESS FROM USER
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            // CHECK OUR GUESS
            if (guess == answers[i]){
                System.out.println("\nCORRECT");

                score += 5;
            }
            else{
                System.out.println("\nWRONG");
            }

        }

        //  DISPLAY FINAL SCORE
        System.out.println("\nYou scored "+score+ " out of "+(5*questions.length));

        scanner.close();
    }
}
