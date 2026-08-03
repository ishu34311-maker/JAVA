import java.util.Scanner;

public class converter {
    public static void main(String[] args){
        // weight conversion porgram
        // declare the varibales 
        // welcome messages
        // user input for choice 
        // option 1 lbs to kgs
        // option 2 kgs to lbs
        // else print not a valid choice 

        Scanner sc = new Scanner(System.in);

        double weight;
        double Neweight;
        int choice;

        System.out.println("Weight converter ");
        System.out.println("1: convert lbs into kgs");
        System.out.println("2: convert kgs into lbs");

        System.out.println("Choose an option: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter your weight in lbs: ");
            weight = sc.nextDouble();
            Neweight = weight * 0.543;
            System.out.printf("The new weight in kgs is: %.2f " , Neweight); 
        }
        else if (choice == 2) {
            System.out.println("Enter your weight in kgs: ");
            weight = sc.nextDouble();
            Neweight = weight / 0.543;
            System.out.printf("The new weight in lbs is: %.2f " , Neweight); 
        }
        else{
            System.out.println("That was not valid a choice");
        }
        sc.close();
    }
}
