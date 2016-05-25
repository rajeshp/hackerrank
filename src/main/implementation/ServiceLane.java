package main.implementation;

import java.util.Scanner;

/**
 * Created by prajesh on 22/06/15.
 */
public class ServiceLane {


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //service lane length
        int len = scanner.nextInt();

        //total cases
        int t=scanner.nextInt();

        int[] lane = new int[len];

        for(int i = 0;i<len;i++)
        {
            lane[i] =  scanner.nextInt();
        }




    }

}
