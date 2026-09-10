import java.util.Scanner;
public class user_arr {
    public static void main(String[] args) {
        
        //String[] foods = {"Aloo Paratha", "Samosa", "Chicken"};

        Scanner sc = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.println("what number of food do you want?");
        size = sc.nextInt();
        sc.nextLine();

        foods = new String[size];

        for(int i = 0; i< foods.length; i++){
            System.out.println("Enter a food: ");
            foods[i] = sc.nextLine();
        }

        for(String food : foods){
              System.out.println(food);
        }
      sc.close();
    }
}
