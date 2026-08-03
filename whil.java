import java.util.Scanner;
public class whil {
    public static void main(String[] args) {
        // while loops repeat some code forever
        // while some condition remains always true.

        Scanner sc = new Scanner(System.in);

        //String name = "Ishu";
        //while (name.isEmpty()) {
          //  System.out.println("Enter your name");
            //name = sc.nextLine();
        //}

        /*String response = "";

        while (!response.equals("Q")) {
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit the game");
            response = sc.next();
        }

            int age = -4;
            //System.out.println("Enter your age");
            //age = sc.nextInt();


           do{
                System.out.println("your age can't be negative");
                System.out.println("enter your age");
                age = sc.nextInt();
            }  while (age < 0);*/

            int number;
            System.out.println("Ente ryou number: ");
            number = sc.nextInt();

             do{
                System.out.println("Enter a number between 1 - 10: ");
                number = sc.nextInt();
            }
            while ( number < 1 || number > 10);

            System.out.println("you picked a number " + number);
        sc.close();
    }
}
