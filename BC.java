public class BC{
    public static void main(String[] args){

        // break = break out of loop (Stop)
        // continue = skip current iteration of a loop(SKIP)
        
        for(int i = 0; i < 10; i++){

            if (i ==5) {
                //break;
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
