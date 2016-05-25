package main.contests.contest101Hack2015.weekofcode;

import java.util.Scanner;

/**
 * Created by prajesh on 08/07/15.
 */
public class SumOfAbsolutes {

public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int totalCases = scanner.nextInt();

    int[] arr = new int[N];

    for(int i=0;i<N;i++)
    {
        arr[i] = scanner.nextInt();
    }


    int[] result = new int[totalCases];

    for(int i=0;i<totalCases;i++)
    {
        result[i] = Find(arr,scanner.nextInt(),scanner.nextInt());
    }


    for(int i=0;i<totalCases;i++)
    {
        String output = result[i]/2==0 ? "Even" : "Odd";
        System.out.println(output);
    }

}


   static int Find(int[] A, int L,int R)
    {
        int sum = 0;
        for ( int i = L ; i<= R; i=i+1 )
        {
            sum = Math.abs(sum + A[i]);
        }
        return sum;
    }

}
