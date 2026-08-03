import java.util.Scanner;

public class CIcalc {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int timescompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the interest rate(in %): ");
        rate = sc.nextDouble();

        System.out.print("Enter the times compunded per year: ");
        timescompounded = sc.nextInt();

        System.out.print("Enter the years: ");
        years = sc.nextInt();

        amount = principal * Math.pow(1 + rate / timescompounded, timescompounded * years);

        System.out.println("The amount after " + years + " is: Rs" + amount);
        
        sc.close();
    }
}
