public class agg {
    public static void main(String[] args) {
        //Aggregation = Represents a "has-a" relationship between obejcts.
        //             one objects contains another object as a part of its structure,
        //              but the contained object/s can exist independently.


        Kitab book1 = new Kitab("Atomic-habits", 200);
        Kitab book2 = new Kitab("MOV", 1000);
        Kitab book3 = new Kitab("King", 2000);

        Kitab[] books = {book1, book2, book3};

        Library library = new Library("Hustle public library", 1897, books);
        library.displayinfo();

    }
}
class Kitab{
    String title;
    int pages;

    Kitab(String title, int pages){
        this.title = title;
        this.pages = pages;

    }
    String displayinfo(){
        return this.title + " ("+ this.pages +" pages)";  
    }
}

class Library{
    String name;
    int year;
    Kitab[] books;

    Library(String name, int year, Kitab[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }
    void displayinfo(){
        System.out.println("The " + this.year + " " + this.name);

        System.out.println("Book available: ");
        for(Kitab book : books){
            System.out.println(book.displayinfo());

        }
    }
}