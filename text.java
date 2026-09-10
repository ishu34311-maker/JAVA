public class text {
    public static void main(String[] args){

        Book[] books = {new Book("Java", "Ishu", 5000),
                        new Book("Dsa", "Jay", 2000),};

                        System.out.println("Before increasing price: ");

        for(Book book : books){
            
            System.out.println("Title : "+ book.title);
            System.out.println("author : " +book.author);
            System.out.println("price : "+book.price);
        }

        System.out.println("After increasing price: ");

        for(Book book : books){
            book.price += 100;
            
            System.out.println("Title : "+ book.title);
            System.out.println("author : " +book.author);
            System.out.println("price : "+book.price);
        }
    }
}


class Book{
    String title;
    String author;
    int price;

    Book(String title, String author, int price ){

        this.title = title;
        this.author = author;
        this.price = price;
    }
}
