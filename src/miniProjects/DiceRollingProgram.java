package src.miniProjects;

import java.util.Scanner;
import java.util.Random;

public class DiceRollingProgram {
    public static void main(String[] args) {
         // JAVA DICE ROLLER PROGRAM
         System.out.println("DICE ROLLING PROGRAM");
         
         // DECLARE VARIABLES
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();

         int numOfDice;
         int total = 0;

         // GET # OF DICE FROM THE USER
         System.out.print("\nEnter the # of dice to roll: ");
         numOfDice = scanner.nextInt();

         // CHECK IF # OF DICE IS > 0
         if (numOfDice > 0) {
            // ROLL ALL THE DICE
            for (int i = 1; i <= numOfDice; i++){
                int roll = random.nextInt(1, 7);

                System.out.println("\nYou rolled: "+roll);
                printDie(roll);
                total += roll;
            }
            // GET THE TOTAL
            System.out.println("\nYour total is "+total);
         }
         else if (numOfDice < 0) {
            System.out.println("\nYou cannot enter -ve number.");
         }
         else{
            System.out.println("\nYou cannot enter 0.");
         }

         scanner.close();
    }
        // DISPLAY ASCII OF DICE
        static void printDie(int roll){
            //multi-line string
            String dice1 = """
                      -------
                     |       |
                     |   0   |
                     |       |
                      -------
                    """;
            
            String dice2 = """
                      -------
                     | 0     |
                     |       |
                     |     0 |
                      -------
                    """;

            String dice3 = """
                      -------
                     | 0     |
                     |   0   |
                     |     0 |
                      -------
                    """;

            String dice4 = """
                      -------
                     | 0   0 |
                     |       |
                     | 0   0 |
                      -------
                    """;

            String dice5 = """
                      -------
                     | 0   0 |
                     |   0   |
                     | 0   0 |
                      -------
                    """;

            String dice6 = """
                      -------
                     | 0   0 |
                     | 0   0 |
                     | 0   0 |
                      -------
                    """;

            switch (roll) {
                case 1 -> System.out.println(dice1);
                case 2 -> System.out.println(dice2);
                case 3 -> System.out.println(dice3);
                case 4 -> System.out.println(dice4);
                case 5 -> System.out.println(dice5);
                case 6 -> System.out.println(dice6);
                default -> System.out.println("Invalid roll");
            }
        }

}
