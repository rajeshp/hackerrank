package main.warmup;

import java.io.*;
import java.util.*;

/**
 * Created by prajesh on 16/06/15.
 */
public class AngryProfessor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();

        String[] results= new String[n];

        for(int i=0;i<n;i++)
        {
            int N = scanner.nextInt();
            int K = scanner.nextInt();



            int[] arr = new int[N];

            int presentCount=0;

            for(int j=0;j<N;j++)
            {
                arr[j] = scanner.nextInt();

                if(arr[j] <= 0)
                    presentCount++;
            }

            if(presentCount >= K)
                results[i]="NO";
            else
                results[i]="YES";



        }


        for(int i=0;i<n;i++)
            System.out.println(results[i]);



    }

}
