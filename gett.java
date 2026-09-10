public class gett {
    public static void main(String[] args) {


        //They help protect object date and add rules for accessing or modifying them.
        //GETTERS = Methods that make a field READABLE.
        //SETTERS = Methods that make a field WRITEABLE.

        Food food = new Food("Daal-Baati","Yellow",100);

        food.setName("Pav-Bhaji");
        food.setColor("Red");
        food.setPrice(-1000);

       
        System.out.println(food.getName() + " "+ food.getColor() +" "+ food.getPrice());

    }
}
class Food{
   private String name;
    private String color;
    private int price;

    Food(String name, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }

    String getName(){
        return this.name;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$" + this.price;
    }
    void setName(String name){
        this.name = name;
    }

    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){

        if (price < 0) {
            System.out.println("Price can't be less than zero");
        } else{
        this.price = price;
        }
    }
}