import java.util.Scanner;

public class math{
    public static void main(String[] args) {

       //System.out.println(Math.E);
        // System.out.println(Math.PI);
        //double result;

        //result = Math.pow(3,5);
        //result = Math.sqrt(9);
        //result = Math.abs(-5);
        //result = Math.floor(3.99);
        //result = Math.ceil(3.14);
        //result = Math.round(3.14);
        //result = Math.min(10, 20);
       // result = Math.max(10, 20);

        //System.out.println(result);
        
        
        //Hypotenuse c = Math.sqrt(a2 + b2)

         //Scanner sc = new Scanner(System.in);

        //double a;
        //double b;
        //double c;

        //System.out.print("Enter the length of side A:");
        //a = sc.nextDouble();

       // System.out.print("Enter the length of side b:");
        //b = sc.nextDouble();

        //c = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
        //System.out.println("The hypotenuse is :" + c );

        //sc.close();

        // circumference = 2 * Math.PI * radius;
        //area = Math.PI * Math.pow(Radius,2);
        // volume = (4.0 / 3.0 )* Math.PI * Math.pow (radius, 3);

        Scanner sc = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;


        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of circle is :" + circumference + "cm");

        area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area is : " + area);

        volume = (4.0 / 3.0 )* Math.PI * Math.pow (radius, 3);
        System.out.println("the volume is : " + volume);

        //specifier-character
        //for string use %s
        //for char %c
        //for int %d
        //for double %f
        // for boolean %b
        String name = "Ishu";
        char firstletter = 'I';
        int age = 21;
        double height = 40.5;
        boolean isEmployed = true;

        System.out.printf("Hello!! %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstletter);
        System.out.printf("you are %d years old \n", age);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        //flags
        //( = negative no enclose by ()
        // + to add postive sign in the beginnig
        // use comma for separating 4 digit no 
        

        double p1 = 99896.099;
        double p2 = 1000.13;
        double p3 = -50.76;

        System.out.printf("%(f\n", p1);
        System.out.printf("%(f\n", p2);
        System.out.printf("%(f\n", p3);

        //width
        // 0 = zero padding
        //number = right justified padding;
        //negative number = left justified padding

        int id1 =1;
        int id2 =23;
        int id3 = 456;
        int id4 = 7890;
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

        sc.close();
        
        
        }
}