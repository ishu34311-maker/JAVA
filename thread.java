import java.util.Scanner;

public class thread {
    public static void main(String[] args) {
        
        //Threading = Allows a program to run multiple tasks simultaneously 
        //            Helps improve performance with time-consuming operations
        //            (File I/O, network communication, or any background tasks)


        //How to create a Thread
        //Option 1: Extend the thread  class(simpler)
        //Option 2: Implement the runnable interface(better)



        Scanner sc = new Scanner(System.in);

        MYrunnable myrunnable = new MYrunnable();
        Thread thread = new Thread(myrunnable);
        thread.setDaemon(true);
        thread.start();
        System.out.println("you have 5 Seconds to enter your name ");
        System.out.println("Enter your name: ");
        String name =sc.nextLine();
        System.out.println("Hello "+ name);

        sc.close();
    }
}
class MYrunnable implements  Runnable{
    @Override 
    public void run(){
         for(int i =1; i<=5; i++){

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException a){
                System.out.println("Thread was interuppted");
            }
            if (i==5) {
                System.out.println("Time's up");
                System.exit(0);
            }
        }
    }
}

