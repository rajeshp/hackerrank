package main.dp;

import java.util.Scanner;

/**
 * Created by prajesh on 16/06/15.
 */
public class Candies {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] c = new int[n];

        for(int i=0;i<n;i++)
        {
            c[i] =  scanner.nextInt();
        }


        int result = findMinCandies(c);


    }

    public static int findMinCandies(int[] c)
    {
        int[] result = new int[c.length];

        for(int i=0;i<c.length-1;i++)
        {
            if(c[i+1] > c[i])
            {
                c[i]++;
                c[i+1]=c[i]+1;
            }

            if(c[i+1]<c[i])
            {
                c[i]++;
                c[i+1]=c[i]-1;
            }


        }


        int totalCandies=0;

        for(int i=0;i<result.length;i++)
        {
            totalCandies+=result[i];
        }

        return totalCandies;

    }

}
