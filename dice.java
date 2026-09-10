import java.util.Scanner;
import java.util.Random;

public class dice {
    public static void main(String[] args) {
        //JAVA dice roller Program

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Declare Varibales
        int numofdice;
        int total = 0;


        // Get a dice from the user

        System.out.println("Enter the number of dice to roll: ");
        numofdice = sc.nextInt();


        // check if no of dice > 0

        if (numofdice > 0) {
           for(int i =0; i<numofdice; i++){
            int roll = random.nextInt(1,7);
            printdie(roll);
            System.out.println("You rolled: " + roll);
            total += roll;
        }
        System.out.println("Total: " + total);

        }
        else{
            System.out.println("Number should be greater than 0");
        }
        // Roll all the dice
        //GEt the total
        //Display ASCII of dice
        


        sc.close();
    }

    static void printdie(int roll){

        String dice1 = """
                -------
               |       |
               |   ●   |
               |       |
                -------
                """;
        String dice2 = """
                -------
               | ●      |
               |        |
               |      ● |
                -------
                """;
        String dice3 = """
                -------
               | ●      |
               |   ●    |
               |      ● |
                -------
                """;
        String dice4 = """
                -------
               | ●    ● |
               |        |
               | ●    ● |
                -------
                """;
        String dice5 = """
                -------
               | ●    ● |
               |   ●    |
               | ●    ● |
                -------
                """;
        String dice6 = """
                -------
               | ●   ● |
               | ●   ● |
               | ●   ● |
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
