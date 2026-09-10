import java.util.Scanner;
import java.util.Random;


public class rock {
    public static void main(String[] args) {
        // Rock Paper Scissors Game 

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("##########################################");
        System.out.println("Welcome the ROCK, PAPER & SCISSORS Game!!");
        System.out.println("##########################################");

        //Declare variables
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "Yes";

        do{
            // get choice from the user
        System.out.print("Enter your Move: ");
        playerChoice = sc.nextLine().toLowerCase();

        if (!playerChoice.equals("rock")&& 
                !playerChoice.equals("paper")&&
             !playerChoice.equals("scissors")) {
            System.out.println("Invalid choice");
            continue;

        }
        
        // get random choice for the computer

        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: " + computerChoice);
        // check win conditions 

        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!!");
        }else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) || 
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))){

                    System.out.println("You win!!!");
        }
        else {
            System.out.println("You lose");
        }
        // Ask to play again? 
        System.out.println("Play again (yes/no): ");
        playAgain = sc.nextLine().toLowerCase();


        } while(playAgain.equals("yes"));

        
        // good bye message 
        System.out.println("Thanks for playing!!");
        sc.close();
    }
}

