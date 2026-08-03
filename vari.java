public class vari{

    static int x = 3; //Class Scope
    public static void main(String[] args) {
        
        int x = 1; //local variable
        System.out.println(x);
        
       doSomething();
    }

    static void doSomething(){
        int x = 2; //Local  variable
        System.out.println(x);
    }
}
