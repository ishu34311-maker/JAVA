import java.util.Scanner;

public class F{
    public static void main(String[] args) throws InterruptedException {
        //for loops = execute some code a certain amount of times
          //for(int i = 0; i <=  10; i+=2){
            //System.out.println(i);

            /*Scanner sc = new Scanner(System.in);

            System.out.println("Enter how many times you want to loop");
            int max = sc.nextInt();

            for(int i = 0; i < max; i++){
                System.out.println(i);
            }*/

                // countdown for celebration
            //sc.close();

            Scanner sc = new Scanner(System.in);

            System.out.print("How many seconds to countdown from? : ");
            int start = sc.nextInt();

            for(int i = start; i > 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("Fuck you bastard");
            sc.close();
        }
    }

