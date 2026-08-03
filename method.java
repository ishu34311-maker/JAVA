import java.util.Scanner;

public class method {
   public static void main(String[] args) {

        //methods = a block of resuable codes that is executed when called()
        //String name = "ishu";
        //int age = 25;

        Scanner sc = new Scanner(System.in);
       // int num1;
        //int num2;
        //System.out.print("Enter a first number: ");
        //num1 = sc.nextInt();
        //System.out.print("Enter a second number: ");
        //num2 = sc.nextInt();
        //Square(num1, num2);

        int age;
        System.out.print("Enter you age: ");
        age = sc.nextInt();

        if (ageCheck(age)) {
            System.out.println("you may sign up");
        }
        else{
            System.out.println("you must be 18+ to sign up ");
        }

        //happyBirthda(name, age);
        //happyBirthda(name, age);
        //happyBirthda(name, age);

        sc.close();
    }  

   // static void Square( int num1, int num2){
        //System.out.println("Happuy Birthday to you");
        //System.out.println("Happuy Birthday to you");
        //System.out.printf("Happy birthday dear %s\n", name);
        //System.out.printf("you are %d years old\n", age);
        //System.out.println("The square of First number: " + num1*num1);
        //System.out.println("The square of Second number: " + num2*num2);}
        
        static boolean ageCheck(int age){
            if (age >= 18) {
                return true;
            }
            else{
                return false;
            }
        }
    
}
