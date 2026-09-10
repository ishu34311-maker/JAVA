public class abs {
    public static void main(String[] args) {
        //abstract = used to define abstract classes ad methods.
        //    Abstraction is the process  of hiding the implementation details
        //    and showing only the essential features.
        //    Abstract classes can't  be instantiated directly 
        //    can contai "abstract " methods (which must be implemeneted)
        //    can contain 'concrete' methods (which are inherited)


        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);
        
        circle.display();
        triangle.display();
        rectangle.display();
        
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}

abstract class Shape{

    abstract double area(); //ABSTRACT

    void display(){
        System.out.println("This is a Shape"); //CONCRETE METHOD
    }
}
class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override 
    double area(){
        return Math.PI*radius*radius;
    }
}
class Triangle extends Shape{

    double base;
    double height;
    Triangle(double base, double height){
        this.base = base;
        this.height = height;

    }
    @Override 
    double area(){
        return 0.5*base*height;
    }
}
class Rectangle extends Shape{

    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override 
    double area(){
        return length * width;
    }
}

