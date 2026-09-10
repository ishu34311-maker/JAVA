import java.util.Scanner;
import java.util.Random;

public class slot {
    public static void main(String[] args) {
        

        // JAVA Slot machine

        //Declare Variable

        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;


        
        // Display Welcome message

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Welcome to Slot. ");
        System.out.println("Symbols: 🍒 🍓 🍇 💲 🎉");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // PLay if Balance > 0

        while(balance > 0) {
            System.out.println("Current balance : 💲" + balance);
            // Enter bet amount 
            System.out.print("place your bet amount: ");
            bet = sc.nextInt();
            sc.nextLine();
            // Verify if bet > balance 
            if (bet > balance) {
                System.out.println("Insufficent Balance: ");

                // verify if bet > 0
            }else if (bet <= 0) {
                System.out.println("Balnace must be greater than 0");
            }
            // subtract bet from balance 
            else{
                balance -= bet;
                //System.out.println("💲" + balance);
            }
            System.out.println("Spinning.....");
            row = spinRow();
            printRow(row);
            //getPayout(row, bet);
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else {
                System.out.println("Sorry you lost this  round. ");
            }
            System.out.println("Do you want to play Agian: (Y/N) ");
            playAgain = sc.nextLine().toUpperCase();
            if (!playAgain.equals("Y")) {
                break;
            }
        }

        System.out.println("Game OVER! your final v=current balance is " + balance);
        // spin row print row 
        // get payout 
        // askt to play again 
        // display exit message 


        sc.close();
    }
    static String[] spinRow(){
        String[] symbols = {"🍒", "🍓", "🍇", "💲", "🎉"};
        String[] row = new String[3];
        Random random = new Random();

      

       for(int i =0; i < 3; i++){
        row[i] =  symbols[random.nextInt(symbols.length)];
       }

       System.out.println(row[0] + row[1] + row[2]);


        return row;

    }
    static void printRow(String[] row){
                System.out.println("********************");
                System.out.println(" " + String.join(" | ", row));
                System.out.println("********************");
        }
    static int getPayout(String[] row, int bet){

        if (row[0].equals(row[1]) && row[1].equals(row[2]) ){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                 case "🍓" -> bet * 4;
                  case "🍇" -> bet * 5;
                   case "💲" -> bet * 10;
                    case "🎉" -> bet * 20;
                    default -> 0;

            };
        }

            else if ( row[0].equals(row[1]) ){
            return switch(row[1]){
                case "🍒" -> bet * 2;
                 case "🍓" -> bet * 3;
                  case "🍇" -> bet * 4;
                   case "💲" -> bet * 5;
                    case "🎉" -> bet * 10;
                    default -> 0;

            };
        }
            else if (row[1].equals(row[2]) ){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                 case "🍓" -> bet * 4;
                  case "🍇" -> bet * 5;
                   case "💲" -> bet * 10;
                    case "🎉" -> bet * 20;
                    default -> 0;

            };
        }
        return 0;
    

    
}
}
