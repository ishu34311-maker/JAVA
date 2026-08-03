import java.util.Scanner;


public class shop {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String Item;
        Double Price;
        int Quantity;
        char Currency = 'R';
        double total;

        System.out.print("What would you like to have?: ");
        Item = sc.nextLine();

        System.out.print("What is the price each?: ");
        Price = sc.nextDouble();
        System.out.print("How many Quantity do you want to have?: ");
        Quantity = sc.nextInt();
        
        total = Price * Quantity;

        System.out.println("\n You have bought "+ Quantity + " "+ Item + "/s");
        System.out.println("Your total is "+ Currency + total);

        sc.close();


    }
}
