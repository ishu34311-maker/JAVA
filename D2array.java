import java.util.Scanner;

public class D2array {
    public static void main(String[] args) {
        
        //declaration
        //int arr[][];
        //allocation
       // arr = new int[3][4];
        //intialization
      /*   int[][] brr = {{1,2},
                       {3,4,5},
                       {5,6,7,8},
        };
        int n = brr.length;
        //int m = brr[0].length;

        //System.out.println(brr[1][1]);

        for(int i=0; i<n; i++){
            int m = brr[i].length;
            for(int j=0; j< m; j++ ){
                System.out.print  (brr[i][j]+ " ");
            }
            System.out.println();
        }
*/
          /*int arr[][] = new int[3][4];
          int n = arr.length;
          

          Scanner sc = new Scanner(System.in);
          
          for(int i = 0; i < n; i++){
            int m = arr[i].length;
            for (int j =0; j< m; j++){
                System.out.println("Provide value for row" + i + " and column:"+ j);
                arr[i][j] = sc.nextInt();
            }
          }

          for(int i = 0; i<n; i++){
            int m = arr[i].length;
            for(int j =0; j < m; j++){
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();
          }
          System.out.println(); */


          int arr[][] ={{1,2,3}, {4,5,6}};
          int max = 0;
          int n = arr.length;

          for(int i =0; i< n; i++){
            int m = arr[i].length;

            for (int j =0; j< m; j++){

                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
          }

          System.out.println(max);
    }
}
