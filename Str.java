import java.util.Scanner;

public class Str{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter you name");
        name = sc.nextLine();
        
        //int length = name.length();
        //char letter = name.charAt(0);
        //int index = name.indexOf("  ");
        //int lastIndex = name.lastIndexOf("u");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        // name = name.trim();
       // name = name.replace("I", "e");

       //System.out.println(name.isEmpty());
        //System.out.println(name);
        //System.out.println(letter);
        //System.out.println(length);

        //if (name.contains(" ")) {
          //  System.out.println("Your name contain space");
          // //else{
          //  System.out.println("Your nam e do not conatian any space");
        //}

        if(name.equals("password")){
            System.out.println("Your name cannot be password");
            }else{
                System.out.println("hello" + name);
            }
            
            
            }
}
