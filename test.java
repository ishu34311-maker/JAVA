import java.util.Scanner;

public class test {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);


    String name;
    int age;
    boolean isStudent;

    System.out.print("Enter your name: ");
    name = sc.nextLine();
    System.out.print("Enter your age: ");
    age = sc.nextInt();
    System.out.print("Are you a student ? (true/ false): ");
    isStudent = sc.nextBoolean();

    if (name.isEmpty()) {
      System.out.println("You didnt enter you name: ");
    }
    else{
      System.out.println("Hello "+ name + "!!");

    }

    if (age >= 65) {
      System.out.println("You are a senior!");
    }
    else if (age >= 18) {
      System.out.println("You are adult!");
    }
    else if (age < 0) {
      System.out.println("You haven't been born yet");
      } else if(age == 0){
        System.out.println("You are a baby! ");
      }

      if (isStudent) {
        System.out.println("You are a student");
      }
      else{
        System.out.println("you are not a student");
      }


    sc.close();
  }
}
