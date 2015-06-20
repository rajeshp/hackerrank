package main;

import java.util.Scanner;

/**
 * Created by prajesh on 19/08/14.
 */
public class FindDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalCases = scanner.nextInt();

        long[] inputs = new long[totalCases];
        long[]  outputs = new long[totalCases];

        for(int i=0;i<totalCases;i++)
        {
            inputs[i] = scanner.nextInt();
        }

        // process
        for(int i=0;i<totalCases;i++)
        {
            outputs[i] = findDivisibleDigits(inputs[i]);
        }

        //output
        for(int i=0;i<totalCases;i++)
        {
            System.out.printf(""+outputs[i]);
        }


    }


    public static int findDivisibleDigits(long n)
    {
        int[] digits = getDigits(n);

        int count=0;

        for(int digit : digits)
        {
            if(digit!=0 && n % ((long)digit) == 0 )
            {
                count++;
            }


        }

        return count;
    }

    public static final int[] getDigits(long n)
    {
        if(n<=0) return null;
        int len = new String(""+n).length();
        int[] digits = new int[len];

        int i=0;
        while(n>0)
        {
            digits[i++] = (int) (n%((long)10));
            if(n!=0)
                n=n/10;
        }

        return digits;
    }
}
