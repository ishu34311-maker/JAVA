import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datetime {
    public static void main(String[] args) {
        //How to works with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC Timestamp)

        /* LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant); */

        //Custom format 

       /*  LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss" );
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime); */

        LocalDateTime date = LocalDateTime.of(2004, 12, 13, 20, 9, 12);
        LocalDateTime date2 = LocalDateTime.of(2004, 12, 13, 20, 9, 12);
        LocalDateTime date3 = LocalDateTime.of(2005, 1, 1, 23, 0,0);

        if (date.isBefore(date2)) {
            System.out.println(date + "is earlier than" + date2);
        }
        else if (date.isAfter(date2)) {
            System.out.println(date + "is late than" + date2);
        }else if (date.isEqual(date2)) {
            System.out.println(date + "is equal to" + date2);
        }
       

    }
}
