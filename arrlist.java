import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class arrlist{
    public static void main(String[] args){

        //ArrayList = A resizeable arrays that stores objects (autoboxing).
        //            Arrays are fixed in size, but ArrayLists can change.

       /*  ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("BAnana");
        fruits.add("Coconut");

        //fruits.remove(0);
        fruits.set(0, "pineapple");
        //System.out.println(fruits.get(1));
        //System.out.println(fruits.size());
        Collections.sort(fruits);
        
        for(String fruit : fruits){
            System.out.println(fruit);
        } */
       Scanner sc = new Scanner(System.in);

       ArrayList<String> foods = new ArrayList<>();

       System.out.print("Enter the size of array List: " );
       int numofFoods = sc.nextInt();
       sc.nextLine();

       for(int i =1; i<= numofFoods; i++){
        System.out.println("Enter food #" + i + ": ");
        String food = sc.nextLine();
        foods.add(food);
       }
       System.out.println(foods);

       ArrayList<Character> symbols = new ArrayList<>();

       System.out.println("Enter the size of symbol list: ");

       int numofsymbol = sc.nextInt();
       sc.nextLine();

       for(int i =1; i<= numofsymbol; i++){
        System.out.println("Enter Symbols #" + i + ": ");
        char symbol = sc.next().charAt(0);
        symbols.add(symbol);
       }
       System.out.println(symbols);
       sc.close();
    }
}