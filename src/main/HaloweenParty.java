package main;

import java.util.Scanner;

/**
 * Created by prajesh on 18/08/14.
 */
public class HaloweenParty {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int totalCases = scanner.nextInt();

        long[] results = new long[totalCases];

        for(int i=0;i<totalCases;i++)
        {
            results[i] = getMaxiumPieces(scanner.nextLong());
        }

        for(int i=0;i<totalCases;i++)
        {
            System.out.println(results[i]);
        }

    }


    private static long getMaxiumPieces(long n)
    {
        if(n<=0) return 0;

        if(n==1) return 1;


            if(n%2==0)
            {
                long m = n/2 ;
                return m * m ;
            }
            else
            {
                long m = n/2 ;
                return m * (m+1) ;
            }



    }

}
