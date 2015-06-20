package main.warmup;

import java.io.*;
import java.util.*;

/**
 * Created by prajesh on 16/06/15.
 */
public class DiagonalDifference {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n =  scanner.nextInt();

        int[][] matrix = new int[n][n];

        for(int i=0;i<n;i++)
        {

            for(int j=0;j<n;j++)
            {
                matrix[i][j]=scanner.nextInt();
            }

        }

    int sumDiagonal1=0,sumDiagonal2=0;
    int k=0, p=n-1;
        for(int i=0;i<n;i++)
        {
            if(k<n)
            {
                sumDiagonal1+=matrix[i][k];
            }

            k++;
        }

        k=0;

        for(int j=n-1;j>=0;j--)
        {
            if(k<n)
            {
                sumDiagonal2+=matrix[k][j];
            }

            k++;
        }


        int result = Math.abs(sumDiagonal1 - sumDiagonal2);

        System.out.println(result);



    }

}
