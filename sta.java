public class sta {
    public static void main(String[] args) {
        //static = Makes a variable or method belong to the class 
        //         rather than to any specific object
        //         Commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Vansh");
        Friend friend2 = new Friend("Ishu");
        Friend friend3 = new Friend("Aaru");
        Friend friend4 = new Friend("kdnx");
        Friend friend5 = new Friend("ekj");
        /*System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println(Friend.numOffriends)*/

        Friend.showfriends();
        //utility method 
        Math.round(3.45);
        System.out.println(Math.max(3.49,3.82));
    }
}


class Friend{
    static int numOffriends;
    String name;

    Friend(String name ){
        this.name = name;
        numOffriends++;
    }

    static void showfriends(){
        System.out.println("You have "+ numOffriends + " total friends");
    }
}