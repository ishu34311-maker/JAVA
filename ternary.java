
public class ternary {
    public static void main(String[] args) {
        // ternary operator ? = Return 1 or 2 values if condition is true
        // variable = (condition)? iftrue : ifFalse;

        int income = 60000;
        int num = 557;
        int marks = 39;

        double Taxrate = (income >= 50000) ? 20 : 12;
        String EvenorOdd = (num % 2 == 0) ? "Even" : "Odd";
        String PassOrFail = (marks >= 60) ? "Pass" : "Fail";

        System.out.println(Taxrate);
        System.out.println(EvenorOdd);
        System.out.println(PassOrFail);
    }
}
