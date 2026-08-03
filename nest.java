import java.util.Scanner;

public class nest {
    public static void main(String[] args) {
        //nested loop = a loop inside another loop
        // used often with matrices or DSA

       /*  for(int j = 1; j <= 3; j++){
        for(int i = 1; i <= 9; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }*/

        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        char Symbol;

        System.out.print("Enter a no of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter a no of columns: ");
        columns = sc.nextInt();
        System.out.print("Enter a symbol: ");
        Symbol = sc.next().charAt(0);

        for(int j = 0; j < rows; j++){
            for(int i = 0; i < columns; i++){
            System.out.print(Symbol);
        }
        System.out.println();
        }
        sc.close();  
    }
}
