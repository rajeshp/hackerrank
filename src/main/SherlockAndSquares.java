package main;

import java.util.Scanner;

/**
 * Created by prajesh on 4/3/16.
 */
public class SherlockAndSquares {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();


        int[] A = new int[T];
        int[] B = new int[T];


        int c=0;

        while(c < T){
             A[c] = scanner.nextInt();
             B[c] = scanner.nextInt();
            c++;
        }

        c=0;
        int count=0;

        while(c<T){

            count = 0;

            double sqrtA =  Math.sqrt(A[c]);
            double sqrtB = Math.sqrt(B[c]);


            int p = (int) sqrtA ;
            int q = (int) sqrtB;


            if(p*p == A[c])
                    System.out.println(q-p+1);
                else
                    System.out.println(q-p);

            c++;
        }



    }
}
