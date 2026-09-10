import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   /*int arr[] = {10,20,30,40,50};
    int sum = 0;
    int n = arr.length;

    for(int i =0; i< n; i++){
      int value  = arr[i];
      sum = sum + value;
    }
    System.out.println(sum);  

    int bhum[] ={2,3,10,20};
    int ishu =1;
    int n = bhum.length;

    for(int i =0; i<n; i++){
      int value = bhum[i];
      ishu = ishu * value;
    }
    System.out.println(ishu);

    //find maximum value in array
    int arr[] ={21, 3, 50, 4};
    int largest = arr[0];
    int n = arr.length;

    for(int i = 0; i < n; i++){
      if (largest < arr[i]) {
        largest = arr[i];
      }
    }
     System.out.println("Your largest number is : " + largest);*/
      int arr[] ={21, 3, 50, 4};
    int min = arr[0];
    int n = arr.length;

     for(int i = 0; i < n; i++){
      if (min > arr[i]) {
        min = arr[i];
      }
    }
     System.out.println("Your min number is : " + min);
  

  }
}