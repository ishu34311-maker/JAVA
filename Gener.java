import java.util.ArrayList;
public class Gener{
    public static void main(String[] args){
        // Generics = A concept where you can write a class, interfcae, or method 
        //              that is compatible with different data types.
        //              <T> type parameter (placeholder taht gets replaced with a real type)
        //              <String> type argument (specifies the type

        Product<String, Double> product = new Product<>("apple", 0.75);

        System.out.println(product.getItem());


    }
}

/* class Box<T> {
    
    T item;
    public void setItem(T item){
        this.item = item;

    }
    public T getItem(){
        return this.item;
    }
} */
class Product<T,U>{

    T item;
    U price;

    Product(T item, U price){
        this.item = item;
        this.price = price;
    }
    public T getItem(){
        return this.item;
    }
    public U getPrice(){
        return this.price;
    }
}
