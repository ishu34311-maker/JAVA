import java.util.Scanner;

public class sw {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");
        String day = sc.nextLine();

        switch(day){
            case "Monday" -> System.out.println("Its the weekday");
            case "Tuesday" -> System.out.println("Its the weekday");
            case "Wednesday" -> System.out.println("Its the weekday");
            case "Thursday" -> System.out.println("Its the weekday");
            case "Friday" -> System.out.println("Its the weekday");
            case "Saturday" -> System.out.println("Its the weekend");
            case "Sunday" -> System.out.println("Its the weekend");
            default -> System.out.println("Its not valid");
             
        }
        sc.close();
    }
}