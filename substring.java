import java.util.Scanner;

public class substring {
    public static void main(String[] args){

        // .substring() = A new method used to extract a portion of a sting 
        // sting.substring(strat, end)

        Scanner sc = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.println("Enter your email: ");


        email = sc.nextLine();

        if (email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain);
        }
        else {
            System.out.println("Email mus contain @ char");

        }
        
        sc.close();
    }
}
