public class vehicle{
    public static void main(String[] args) {
        Bike bike = new Bike("Toyota", 500000, 2020);
        Bike bike2 = new Bike(null);
        Bike bike3 = new Bike("Harley", 28000);
        Bike bike4 = new Bike("Raider", 270000, 2000);


        System.out.println(bike.brand);
        System.out.println(bike.price);
        System.out.println(bike.year);
        System.out.println(bike.isRunning);
         System.out.println(bike2.brand);
        System.out.println(bike2.price);
        System.out.println(bike2.year);
        System.out.println(bike2.isRunning);
         System.out.println(bike3.brand);
        System.out.println(bike3.price);
        System.out.println(bike3.year);
        System.out.println(bike3.isRunning);
         System.out.println(bike4.brand);
        System.out.println(bike4.price);
        System.out.println(bike4.year);
        System.out.println(bike4.isRunning);

        bike.engineON();
       // bike.engineOFF();

    }
}

class Bike{
    String brand;
    int price;
    int year;
    boolean isRunning = false;

    Bike(String brand ){

        this.brand = brand;
        this.price = 0;
        this.year = 0;
    }
    Bike(String brand,int price){

        this.brand = brand;
        this.price = price;
        this.year = 0;
    }
    Bike(String brand,int price, int year ){

        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    void engineON(){
        isRunning = true;
        System.out.println("Your bike is ready to start");
    }
        void engineOFF(){
        isRunning = false;
        System.out.println("Your bike is not ready to start");
    }
}