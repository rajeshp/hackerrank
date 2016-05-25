package main;

import java.util.Scanner;

/**
 * Created by prajesh on 4/3/16.
 */
public class ServiceLane1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int totalCases = scanner.nextInt();

        int[] results = new int[totalCases];

        int[] arr = new int[N];

        for(int i=0;i<N;i++)
            arr[i] = scanner.nextInt();

        for(int i=0;i<totalCases;i++){

            results[i] = minOfArray(arr, scanner.nextInt(), scanner.nextInt());
        }

        for(int i=0;i<totalCases;i++){

            System.out.println(results[i]);
        }

    }

    public static int minOfArray(int[] arr, int i, int j){


        int min = arr[0];

        for(int k=1;k<j;k++){
            if(arr[k] < min)
                min = arr[k];
        }


        return min ;
    }

}
