import java.util.Random;

public class rand {
    public static void main(String[] args){

        Random random = new Random();

         boolean isHeads;

         isHeads = random.nextBoolean();

         if (isHeads) {
            System.out.println("Heads");
         }
         else{
            System.out.println("Tails");
         }
       // double number2;
        //double number3;

        //number1 = random.nextDouble(1,101);
        //number2 = random.nextDouble(1,101);
        //number3 = random.nextDouble(1,101);
        //System.out.println(number1);
        //System.out.println(number2);
        //System.out.println(number3);
    }
}
