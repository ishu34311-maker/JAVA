import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;        

        System.out.println("Enter the temperature: ");
        temp = sc.nextDouble();

        System.out.println("Convert to celsius or farenheit? (C or F) : ");
        unit = sc.next().toUpperCase();

       newtemp = unit.equals("C") ? (temp -32) * 5 / 9 : (temp * 5/9) + 32;
       System.out.printf("%.2f", newtemp);

       sc.close();
    }
}
