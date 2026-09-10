public class supr {

    public static void main(String[] args){

        //Super = Refers to the parent class (subclass <- superclass)
        //    Used in constructors and method overriding
        //   Calls the parent constructor to initialize attributes

        Person person = new Person("Vanshika", "Mewade");
        Stuent stuent = new Stuent("Ishu", "Hada", 10);
        Employ employ = new Employ("Usha", "Hada", 10000);

        person.showName();
        stuent.showName();
        employ.showName();
        stuent.showGPA();
        employ.showSalary();
         
    }
}

class Person{

    String first;
    String last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }
    void showName(){
        System.out.println(this.first + " " + this.last);
    }
}

class Stuent extends Person{

    double gpa;

    Stuent(String first, String last, double gpa){

        super(first, last);
        this.gpa = gpa;
    }
    void showGPA(){
        System.out.println(this.first + " 's gpa is : " + this.gpa);
    }
}

class Employ extends Person{

    int salary;

    Employ(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first + "'s salary is $" + this.salary);
    }
}
