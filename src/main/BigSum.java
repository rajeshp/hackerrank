package main;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by prajesh on 25/06/15.
 */
public class BigSum {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();


        long result=0L;

        for(int i=0;i<N;i++)
        {
            result+=scanner.nextInt();
        }


        System.out.println(result);
    }


}
