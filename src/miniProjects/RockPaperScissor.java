package src.miniProjects;

import java.util.Scanner;
import java.util.Random;

class RockPaperScissor {
    public static void main(String[] args) {
        // ROCK-PAPER-SCISSOR PROGRAM

        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissor"};

        String playerChoice;
        String computerChoice;
        String playAgain = "y";
        int score = 0;
        int counter = 0;

        System.out.println("Game Rules: 1. (r->rock) (p->paper) (s-scissor)");
        //System.out.println("            2. You must score 2/3 times to win.");
        
        do{
            for(int i = 0; i < 3; i++){

               System.out.print("\nEnter your move: ");
                playerChoice = scanner.nextLine().toLowerCase();

                // VALIDATION
                if(!playerChoice.equals("r") &&
                    !playerChoice.equals("p") &&
                    !playerChoice.equals("s")){
                    System.out.println("Invalid Response");
                    continue;
                }


                // GET RANDOM CHOICE FROM COMPUTER
                computerChoice = choices[random.nextInt(3)];
                System.out.println("Computer choice: "+computerChoice);


                // WIN CONDITION
                if(playerChoice.equals(computerChoice)){
                    System.out.println("Tie");
                }

                else if(playerChoice.equals("r") && computerChoice.equals("scissor") ||
                        playerChoice.equals("p") && computerChoice.equals("rock") ||
                        playerChoice.equals("s") && computerChoice.equals("paper")){

                    System.out.println("Win");
                    score++;
                }

                else{
                    System.out.println("Lose");
                }
                counter++;
  
            }

            // ASK TO PLAY AGAIN?
            System.out.print("\nDo you want to play again(y/n)?: ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("y"));


        // GOODBYE MESSAGE
        System.out.println("\nOut of " + counter + " games:");
        
        System.out.println("You won " +score+ " times.");
        
        score = counter - score;
        System.out.println("You lose " +score+ " times.");

        System.out.println("\nThank You For Playing!!!\n");


        scanner.close();
    }
    
}