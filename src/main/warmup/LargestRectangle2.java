package main.warmup;

import java.util.Scanner;

/**
 * Created by prajesh on 17/11/15.
 */
public class LargestRectangle2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =  scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = scanner.nextInt();





        System.out.println(getMax(arr));
    }


    static  int getMax(int[] arr) {

        int min_height=0,k=1, maxRectangle=0;

        min_height = arr[0];

        for(int i=0;i<arr.length;i++){

            if(i>0)
                maxRectangle = k * getMinHeigt(min_height, arr[i]);
            else
                if(i==0)
                    maxRectangle = k * arr[i];

            k++;
        }

        return maxRectangle;
    }


    static int getMinHeigt(int minHeight, int curr){


        return (curr < minHeight) ? curr : minHeight;
    }
}
