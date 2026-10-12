import java.util.ArrayList;

public class LibrarySystem {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Maths2");
        items.add("DSA");
        items.add("Physics");
        items.add("java");
        items.add("Anmol");
    }
    static void borrow(){

    }
    static void giveBack(){

    }
}
abstract class Item{
    abstract String title();
    abstract char id();

    void getLateFee(int days){

    }
}
abstract class Book extends Item{

}
abstract class Magazine extends Item{

}