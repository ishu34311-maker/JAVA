import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Alarmclock {
    public static void main(String[] args) {
        //Java Alarm Clock

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        while(alarmTime == null){

             try{
            System.out.println("Enter an alarm time");
        String inputTime = sc.nextLine();
        
        alarmTime = LocalTime.parse(inputTime, formatter);
        System.out.println("Alarm set for "+ alarmTime);

        }
        catch(DateTimeParseException e){
            System.out.println("Invalid format.");
        }

        }        
        sc.close();
    }
}
