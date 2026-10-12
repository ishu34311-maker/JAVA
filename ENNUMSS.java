import java.util.Scanner;

public class ENNUMSS{
    public static void main(String[] args){

        //Enums = (Enumeration) A special kind of class that
        //          represents a fixed set of constrants.
        //          They imporve code readability and are easy to maintain
        //          More efficent with switches when comparing Strings.\

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week:");
        String respoinse = sc.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(respoinse);

      

        switch (day) {
           case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
            -> System.out.println("It is a weekday");
            case SATURDAY, SUNDAY -> System.out.println("It's a weekend");
        }
    }
    catch(IllegalArgumentException e){
        System.out.println("Please enter a valid day");
    }
        
        sc.close();
    }
}

enum Day{
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNumber;

    Day(int dayNumber ){
        this.dayNumber = dayNumber;
    }

    public int getDayNumber(){
        return this.dayNumber;
    }
}

