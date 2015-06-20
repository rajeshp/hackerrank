package main.dp;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by prajesh on 10/06/15.
 */
public class FibonacciModified {

    private static HashMap<Integer,BigInteger> map = new HashMap<Integer, BigInteger>();

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();

        String b = scanner.next();

        int n = scanner.nextInt();

        map.put(0,new BigInteger(a));
        map.put(1,new BigInteger(b));

        int resultCode = getTn(n);

        if(resultCode==-1)
            System.out.println(0);


        System.out.println(map.get(n-1));

    }

    static int getTn(int n)
    {
        BigInteger ti;

        if(n>0)
        {
            for(int i=2;i<n;i++)
            {
                ti = map.get(i-1).pow(2).add(map.get(i-2));
                map.put(i,ti);

            }

            return 1;
        }

        return -1;
    }

}
