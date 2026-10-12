import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class countime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the countdown time");
        int response = sc.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            
            int count = response;

            @Override 
            public void run(){
            System.out.println(count);
            count--;
                if (count < 0 ) {
                    System.out.println("Happy Birthday Baby!!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
        sc.close();
    }
}
