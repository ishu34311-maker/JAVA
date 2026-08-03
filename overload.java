public class overload {
    public static void main(String[] args) {
        //overloaded methods = methods that share the same name but
        // different paramenters 
        // signature= name + parameters


      /*  System.out.println(add(1, 2, 4, 5));
    }
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        return a + b + c + d ;
    } */


        String Pizza = bakePizza("flat bread", "mozarrella");

        System.out.println(Pizza);



    }
    static String bakePizza(String bread){
        return bread + "Pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String read, String cheese, String topping){

        return topping + " " + cheese + bread + + " pizza";
    }
}
