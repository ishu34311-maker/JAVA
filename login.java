import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String username;
        System.out.println("Enter your username");
        username = sc.nextLine();

        String Password;
        System.out.println("Enter the Password: ");
        Password = sc.nextLine();
        
        if (username.equals("Ishu") && Password.equals("Jack1234")) {
            System.out.println("Login successfully");
        }
        else{
            System.out.println("your credentials are wrong");
        }
        sc.close();

    }
}