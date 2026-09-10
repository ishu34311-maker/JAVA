public class Polymor {
    public static void main(String[] args) {
        //Polymorphism = "Poly "= "Many"
        //               "Morph" = "Shape"
        //                Objects can identify as other objects.
        //               Objects ca be treated as object of a common superclass.

       Mercedes mercedes = new Mercedes();
       Harley harley = new Harley();
       Boat boat = new Boat();

       Motor[] motors = {mercedes, harley, boat};

       for(Motor motor : motors){
        motor.go();
       }

       mercedes.go();
       harley.go();
       boat.go();






         
    }
}

//abstract class Motor {abstract void go();}

public interface Motor {
    void go();
    
}

class Mercedes implements Motor{

    @Override 
    public void go(){
        System.out.println("You drive the car");
    }
}

class Harley implements Motor{
    @Override 
    public void go(){
        System.out.println("You ride the bike");
    }
}

class Boat implements Motor{
    @Override 
    public void go(){
        System.out.println("You sail the ship");
    }
}

