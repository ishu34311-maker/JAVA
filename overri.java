public class overri {
    public static void main(String[] args) {
        //Method overriding = When a subclass provides its own
        //   Implementation of a method taht is already defined.
        // Allows for code reusability and give soecific implemenatation

        Goat goat = new Goat();
        Hen hen = new Hen();
        Octopus octopus = new Octopus();

        goat.move();
        hen.move();
        octopus.move();
    }
}

class Ani{
    void move(){
        System.out.println("this animal is running");
    }
}

class Goat extends Ani{

}
class Hen extends Ani{

}
class Octopus extends Ani{

    @Override 
    void move(){
        System.out.println("the animal is Swimming");
    }

}