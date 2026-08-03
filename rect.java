import java.util.Scanner;

public class rect{
    public static void main(String[] args){

        //Calculate area of a triangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your width: ");
        width = sc.nextDouble();

        System.out.print("Enter the height: ");
        height = sc.nextDouble();

        area = width * height;
        System.out.println("the area is : " + area + "cm");
        
        sc.close();
    }
}

