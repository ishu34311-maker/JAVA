import java.nio.channels.Pipe.SourceChannel;

public class interf {
    public static void main(String[] args) {
        //Interface = A blueprint for a class that specifies a set of abstract methods that implementing classes must define.
        // Supports multiple inheritance like behaviour
        // By interface we can get multiple parents 


        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}

interface Prey {

    void flee();

}

interface Predator{
    
    void hunt();

}

class Rabbit implements Prey{
    @Override 
    public void flee(){
        System.out.println("The Rabbit is running away. ");
    }
}
class Hawk implements Predator{

    @Override 
    public void hunt(){
        System.out.println("The Hawk is hunting");
    }
}
class Fish implements Prey, Predator{

    @Override 
    public void flee(){
        System.out.println("A fish is swimming away");
    }
    @Override 
    public void hunt(){
        System.out.println("The fish is hunting");
    }
}