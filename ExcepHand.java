import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepHand{
    public static void main(String[] args){
        //Exception = An event that interrupts the normal flow of a program 
        //            (Dividing by zero , file not found, mismatch input type)
        //             Surround any dangerous code with a try{} block
        //              try{}, catch{}, finally{}

        

        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number :");
            int no = sc.nextInt();
            System.out.println(no);
        }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number");
        }
        catch(ArithmeticException e){
            System.out.println("YOU Can't DIVIDE BY ZERO!");
        }
        catch(Exception e){
            //SAFETY NET
            System.out.println("Someting went wrong");
        }
        finally{
           // sc.close();
            System.out.println("this always executes");
        }


        
        
    }
}