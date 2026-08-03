import java.util.Random;
import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 101;
        int randomnumber = random.nextInt(min, max);

        System.out.println("Number Guessing game");
        System.out.printf("Enter a number between %d-%d", min, max);

        do{
            System.out.println("Enter a guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < randomnumber) {
                System.out.println("too low");                
            }
            else if (guess > randomnumber) {
                System.out.println("too high");
            }else{
                System.out.println("correct the number was " + randomnumber);
                System.out.println("# of attempts: " + attempts);
            }

        } while(guess != randomnumber);
        sc.close();
    }
}
