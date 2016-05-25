package main.dp;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * Created by prajesh on 19/06/15.
 */
public class StockMaximize {


    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        int totalCases = scanner.nextInt();

        int[][] cases =  new int[totalCases][];

        for(int i=0;i<totalCases;i++)
        {
            int n = scanner.nextInt();



        }



    }


    private static int getMaxStocksProfit(int[] arr)
    {

        int result=0, max=0;


        int[] k = new int[arr.length];


        int temp=arr.length-1;



        for(int i=arr.length-2;i>=0;i++)
        {
            if(temp <= arr[i])
                k[i]=1;
            else
                temp=k[i];
        }


        for(int i=0;i<arr.length;i++)
        {
            System.out.print(k[i]);
        }

        return 0;
    }

}
