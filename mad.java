import java.util.Scanner;

public class mad {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;

        System.out.print("Enter the adjective 1 (appreciating): ");
        adjective1 = sc.nextLine();
        System.out.print("Enter the noun1(person): ");
        noun1 = sc.nextLine();
        System.out.print("Enter the adjective2(Personality): ");
        adjective2 = sc.nextLine();
        System.out.print("enter the Verb1(action): ");
        verb1 = sc.nextLine();

         
        System.out.println("\nSaumil is a " + adjective1 + " comedian but people call him and his comedy " + adjective2);
        System.out.println(noun1 + " is the " + adjective2 + " person in his whole friend circle");
        System.out.println(noun1 + " was " + verb1 + " while his friends are learning.");

        sc.close();



    }
}