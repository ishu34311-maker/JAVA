public class telephone {
    public static void main(String[] args) {
        //2d array = an array where each element is an array 
        // useful for storing a matrix of data

        char[][] tele = {{'1','2','3'},
                       {'4','5','6'},
                       {'7','8','9'},
                       {'*', '0', '#'}};
        
        for(char[] row : tele){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
