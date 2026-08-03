//Take three numbers as input and print the largest number.

import java.util.Scanner;
public class largest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.print("Enter a first number:");
        num1 = sc.nextInt();
        System.out.print("Enter a Second number:");
        num2 = sc.nextInt();
        System.out.print("Enter a third number:");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is " + num1);
        }else if (num1 < num2 && num2 > num3) {
            System.out.println("The largest number is " + num2);            
        }
        else if (num1 < num3 && num2 < num3) {
            System.out.println("The largest number  is "+ num3);
        }
        sc.close();
    }
}
