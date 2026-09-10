public class OOP {
    public static void main(String[] args) {
        //Object = An entity that holds data(attributes)
        //   and can perform actions(methods)
       // it is a refernece data type.

       Car car = new Car();

       //System.out.println(car.make);
       //System.out.println(car.model);
       //System.out.println(car.year);
       //System.out.println(car.price);
       //System.out.println(car.isRunning);

       System.out.println(car.isRunning);
       car.start();
       System.out.println(car.isRunning);
       car.stop();
       System.out.println(car.isRunning);

       car.drive();
       car.brake();
    }
}
class Car {


    String make = "ford";
    String model = "Mustang";
    int year = 2026;
    double price = 500000.00;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine.");
    }
    void drive(){
        System.out.println("You drive the "+ make);
    }
    void brake(){
        System.out.println("You broke the "+ model);
    }
}

