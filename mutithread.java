import java.util.Scanner;

public class mutithread {
    public static void main(String[] args) {
        //Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instructions that run independently)
        //                  Useful for background task por time- consuming opertaions 

        //Scanner sc = new Scanner(System.in);
       
        Thread thread = new Thread(new MyRunnable("PING"));
         Thread thread2 = new Thread(new MyRunnable("PONG"));
         System.out.println("Game Start");

        thread.start();
        thread2.start();

        try{
            thread.join();
            thread2.join();
        }
        catch(InterruptedException e){
            System.out.println("The thread was interuppted");
        }
        System.out.println("Game Over");


        //sc.close();
    }
}

class MyRunnable implements Runnable{

    private final String text;

    MyRunnable(String text){
        this.text = text;

    }
    @Override 
    public void run(){
        for(int i=1; i<= 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(text);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interuppted");
            }
            
        }
    }
}
