//Revising Array

import java.util.Scanner;

public class rev{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //Declarartion
       // int arr[];
        //allocation
        //arr = new int[5];
        //init
        int brr[] = new int[5];

        int n = brr.length;

        for(int i = 0; i < n; i++){
            System.out.println("Prvide input for index  "+ i);
        brr[i] = sc.nextInt();
        } 

        for(int val: brr){
            System.out.println(val);
        }

      
         /*  System.out.println(brr[0]);
        System.out.println(brr[1]);
        System.out.println(brr[2]);*/

        
    }
}


