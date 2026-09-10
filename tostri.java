public class tostri {
    public static void main(String[] args) {
        // toString() = Methid inherited form the object class.
        //    used to return a string representation of an object
        //    it can be overridden to provide a meaningful details.

        Truck truck1 = new Truck("Eicer", "Tata", 2026, "Brown");
        Truck truck2 = new Truck("Mustang", "ford", 2023, "Red");

        System.out.println(truck1);
        System.out.println(truck2);
       // System.out.println(truck.color + " "+ truck.year + " "+ truck.make + " "+ truck.model);



    }
}

class Truck{
    String make;
    String model;
    int year;
    String color;

    Truck(String make, String model, int year, String color){

        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;

    }
    @Override 
    public String toString(){

        return this.color + " "+ this.year + " "+ this.make + " "+ this.model;
    }
}
