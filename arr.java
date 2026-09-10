import java.lang.reflect.Array;
import java.util.Arrays;
public class arr {
    public static void main(String[] args) {
        
        //ARRAY - a collection of values of the same datatype 
        // *think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        //fruits[0] = "pineapple";
        //int numofFruits = fruits.length;

        /*for(int i= 0; i<4; i++){
            System.out.print(fruits[i]+ " ");} */

           // Arrays.sort(fruits);

           Arrays.fill(fruits, "pineapple");
        //enhanced for loop 
         for(String  fruit : fruits){
            System.out.println(fruit);
        }

        
        
    }
}
