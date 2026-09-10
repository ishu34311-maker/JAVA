public class compo {
    public static void main(String[] args) {
        //Composition = Represents a "part-of" relationship between objects.
        //              For example, an Engine is "Part of a car." 
        //              Allows complex objects to be constructed from smaller objects.

       // Lambo lambo = new Lambo("version", 2023, "v13");

        System.out.println(lambo.model);
        System.out.println(lambo.year);
        System.out.println(lambo.engine.type);
        lambo.start();
    }
}

class Lambo {
    String model;
    int year;
    Engine engine;

    Lambo(String model, int year, String type){
        this.model =model;
        this.year = year;
        this.engine = new Engine(type);
    }
    void start(){
        this.engine.start();
        System.out.println("the " + this.model + " is running");
    }

}

class Engine {
    String type;
    
    Engine(String type){
        this.type = type;
    }
    void start(){
        System.out.println("You start the " + this.type + "engine ");
    }
}