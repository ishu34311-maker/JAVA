import java.util.Scanner;

public class logic {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT

       /*  double temp = 23;
        boolean isSunny = false;
         
        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The Weather is good");
            System.out.println("It is Sunny soutside");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The Weather is good");
            System.out.println("It is cloudy soutside");
        }
        else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad");*/

            // username must be between 4 to 12 characters
            //username must not contain spaces and underscores

            Scanner sc = new Scanner(System.in);

            String username;

            System.out.print("Enter your username: ");
            username = sc.nextLine();

            if (username.length() < 4 || username.length() > 12) {
                System.out.println("Username must be between 4 to 12 characters");
            }
            else if (username.contains(" ") || username.contains("_")) {
                System.out.println("Username must not contain spaces and underscores");
            }
            else{
                System.out.println("Welcome " + username);
            }
            sc.close();
        }
    }

