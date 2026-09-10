public class inherit {
    public static void main(String[] args) {
        //inheritance - one class inheirt the attributes and methods 
        // from another class.
        // child <= Parent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();
        
        dog.eat();
        cat.eat();
        System.out.println(dog.lives);
        System.out.println(cat.lives);
        dog.speaks();
        cat.speaks();
        plant.photosynthesis();
        System.out.println(plant.isAlive);
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        
    }
}

class Organism{
    boolean isAlive;

    Organism(){
        isAlive = true;
    }
}

class Plant extends Organism{
    void photosynthesis(){
        System.out.println("The plant absorbs water and sunlight.");
    }
}
class Animal{

    boolean isAlive;

    Animal(){
        isAlive = true;
    }
    void eat(){
        System.out.println("The animal is eating");
    }
}

class Dog extends Animal{
    int lives = 1;
    void speaks(){
        System.out.println("The dog speaks *woof*. ");
    }
}

class Cat extends Animal{
    int lives = 5;

    void speaks (){
        System.out.println("The cat speaks *meow*. ");
    }
}

