import java.util.Scanner;
import java.util.Random;

public class ishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int min = 1;
        int max = 101;
        int randomnumber = random.nextInt(min, max);
        int attempts = 0;

        System.out.println("This is a guess game");
        System.out.println("enter a number between 1-100");

        do{
            System.out.println("Enter a guess");
            guess = sc.nextInt();
            attempts++;

            if (guess < randomnumber) {
                System.out.println("Too low");
               
            }else if (guess > randomnumber) {
                System.out.println("Too high");
            }
            else{
               System.out.println("correct the number was " + randomnumber);
               System.out.println("# of attempts: " + attempts);
            }
           
        } while (guess != randomnumber) ;
            sc.close();
        }
}
