import java.util.Scanner;
public class bank {
    static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
        // Java banking Program for beginners

        
        // Declare Variables

        int choice;
        boolean isRunning = true;
        double Balance = 100000;

        while (isRunning) {
            
        
        //Display Menu

        System.out.println("Welcome To ISHU Banking!!");
        System.out.println("1. Show Balance: ");
        System.out.println("2. Deposit: ");
        System.out.println("3. Withdraw: ");
        System.out.println("4. Exit!! : ");
        
        // Get and Process users choice

        System.out.println("Enter your Choice between 1-4");
        choice = sc.nextInt();

        switch (choice) {
            case 1 -> showBalance(Balance);
            case 2 -> Balance += deposit();
            case 3 -> Balance -= Withdraw(Balance);
            case 4 -> isRunning = false;
            default -> System.out.println("Invalid Choice");
        }
        
        }
        // showBalance()
        
        
        //deposit()
        
        
        //withdraw()
        
        
        //Exit Message

        System.out.println("Thank you Have a nice day ");
        sc.close();
       
      }

      static void showBalance(double Balance){
        System.out.printf("$%.2f\n", Balance);

        System.out.println();
        System.out.println();
      }
      static double deposit(){
        double amount;

        System.out.println("Enter an amount to deposit");
        amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("amount cant be negative");
            return 0;
        }else{
            return amount;
        }

      } 
      static double Withdraw(double Balance){
        double amount;


        System.out.println("Enter amount to be withdrwn: ");
        amount = sc.nextDouble();


        if (amount > Balance) {
            System.out.println("Insufficient Balance");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }

      }
    
      
}
