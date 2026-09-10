import java.util.Scanner;

public class runtimepoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal1 animal1;

        System.out.println("would you like dog or cat? (1. dog and 2. cat): ");
        int choice = sc.nextInt();

        if (choice ==1) {
            animal1 = new Pitbull();
            animal1.speaks();
        }
        else if (choice ==2) {
            animal1 = new Billa();
            animal1.speaks();
        }else{
            System.out.println("INVALID NUMBER");
        }
    }
}

abstract class Animal1{
    abstract void speaks();
}

class Pitbull extends Animal1{
    @Override 
    void speaks(){
        System.out.println("The dog goes 'woof'. ");
    }
}
class Billa extends Animal1{
    @Override 
    void speaks(){
        System.out.println("The cat goes 'meow'");
    }
}