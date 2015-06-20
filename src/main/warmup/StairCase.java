package main.warmup;

import java.io.*;
import java.util.*;
/**
 * Created by prajesh on 16/06/15.
 */
public class StairCase {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n-1;j++)
            {
                System.out.print(" ");
            }

            for(int k=0;k<i+1;k++)
            {
                System.out.print("#");
            }

            System.out.println();
        }


    }

}
