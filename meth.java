import java.util.Scanner;


public class meth {
    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called()

        //double result = square(15);

        Scanner sc = new Scanner (System.in);

        double number;
        double number1;
        double number2;

        System.out.print("Enter a number: ");
        number = sc.nextDouble();
        System.out.print("Enter a number1: ");
        number1 = sc.nextDouble();
        System.out.print("Enter a number2: ");
        number2 = sc.nextDouble();


        System.out.println(square(number));
        System.out.println(cube(number));
        System.out.println(add(number1,number2));
        System.out.println(sub(number1, number2));
        System.out.println(mul(number1, number2));
        System.out.println(div(number1, number2));

        sc.close();
    }
    static double square(double number){
        return number* number;
    }
    static double cube(double number){
        return number * number *number;
    }

    static double add(double number1, double number2){
        return number1 + number2;
    }
    static double sub(double number1, double number2){
        return number1 - number2; 
    }
    static double mul(double number1, double number2){
        return number1* number2;
    }
    static double div(double number1, double number2){
        return number1 / number2;
    }


}
