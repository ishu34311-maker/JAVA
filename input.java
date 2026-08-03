import java.util.Scanner;

public class input{
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    //common issue if you take string input after int or anyone always use scanner.nextLine()
    scanner.nextLine();

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your Marks: ");
    double Marks = scanner.nextDouble();

    System.out.print("Are you a Student ? (true/false): ");
    boolean isStudent = scanner.nextBoolean();

    System.out.println("Hello!! " + name + " Welcome to Java.");
    System.out.println("You are " + age + " Years old.");
    System.out.println("Your marks is " + Marks);
    if(isStudent){
        System.out.println("You are enrolled as Student,");
    }
    else{
        System.out.println("You are not enroled as Student.");
    }


    scanner.close();

   } 
}