package main.warmup;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by prajesh on 16/06/15.
 */
public class PlusMinus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n =  scanner.nextInt();

        int[] arr = new int[n];
        int positiveNums=0,negativeNums=0,zerosCount=0;

        for(int i=0;i<n;i++)
        {
                arr[i]=scanner.nextInt();
                if(arr[i]==0)
                    zerosCount++;
                else
                {
                    if(arr[i] > 0)
                        positiveNums++;
                    else
                        if(arr[i]<0)
                            negativeNums++;
                }
        }


        double positiveRatio=0.0d, negativeRatio=0.0d,zeroRatio=0.0d;

        DecimalFormat dc = new DecimalFormat("##.000");

        System.out.println(dc.format((positiveNums/(n * 0.1))/10));
        System.out.println(dc.format((negativeNums/(n * 0.1))/10));
        System.out.println(dc.format((zerosCount/(n * 0.1))/10));




    }

}
