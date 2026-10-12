import java.util.Timer;
import java.util.TimerTask;

public class timertask {
    public static void main(String[] args) {
        //Timer = Class that schedule task at specific time or periodically.
        //        Useful for: sending notifications, scheduled updates repetitive actions

        // Timer Task = Represents the task that will be executed by the Timer
        //              You will extend the TimerTask class to define your task
        // Create a subclass of TimerTask and @Override run()
        
       // Timer timer = new Timer();
       // TimerTask task = new TimerTask() {

            int count = 3;

            @Override 
           // public void run(){
                System.out.println("hello");
                count--;
                if (count < 0) {
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task,0,  1000);
    }
}
