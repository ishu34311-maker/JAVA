public class anonymous {
    public static void main(String[] args) {
        //Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                Add custom behviour without having to create a new class.
        //               often used for one time use (TimerTask, Runnable, callbacks)

        Bhumika bhumika1 = new Bhumika();
        Bhumika bhumika2 = new Bhumika(){
            @Override 
            void speaks(){
                System.out.println("Scooby Doo says Ruh ruh");
            }
        };

        bhumika1.speaks();
        bhumika2.speaks();
    }
}
class Bhumika{
    void speaks(){
        System.out.println("The dog goes woof");
    }

}


