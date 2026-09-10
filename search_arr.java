import java.util.Scanner;
public class search_arr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[] numbers = {1,9,4,7,3,2,};
        String[] fruits ={"Kiwi", "Apple", "Banana"};
        boolean ifFound = false;
        String target;


        System.out.println("Enter a fruit to search for : ");
        target = sc.nextLine();


        for(int i =0; i < fruits.length; i++){
            if (fruits[i].equals(target)) {
                System.out.println("fruit found at index:  " + i);
                ifFound = true;
                break;
            }
        }
        if(!ifFound) {
            System.out.println("fruit not found in the array. ");
        }
    }
}
