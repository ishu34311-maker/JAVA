public class over {
    public static void main(String[] args) {
        //overloaded constructors = Allow a class to have multiple constructors
        //    with differnet parameter lists.
        //   enable objects to be initalize in various ways.


        User user1 = new User("Ishu");
        User user2 = new User("Bhumi", "nsnnqjk@gmail.com");
        User user3 = new User("Anmol", "ishi@gmail", 21);
        User user4 = new User();


        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);


         System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

         System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);







    }
}



class User{

    String username;
    String email;
    int age;

    User(){
        this.username ="Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    User(String username){
        this.username = username;
        this.email ="not provided";
        this.age =0;
    }
     User(String username, String email){
        this.username = username;
        this.email = email;
        this.age =0;
    }
     User(String username, String email,int age){
        this.username = username;
        this.email = email;
        this.age =age;
    }

}