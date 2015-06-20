package main.Strings;

import java.io.*;
import java.util.*;

public class FunnyString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalCases = scanner.nextInt();

        String[] inputs = new String[totalCases];

        for(int i=0;i<totalCases;i++)
            inputs[i] = scanner.next();


        for(int i=0;i<totalCases;i++)
        {
            if(isFunny(inputs[i]))
                System.out.println("Funny");
            else
                System.out.println("Not Funny");
        }

    }


    private static boolean isFunny(String str)
    {


        char[] arr = str.toCharArray();


        char[] rarr = new char[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            rarr[i] = arr[arr.length-i-1];
        }


        for(int i=1;i<arr.length;i++)
        {
            if(!(Math.abs(arr[i]-arr[i-1]) == Math.abs(rarr[i]-rarr[i-1])))
                return false;
        }

        return true;
    }

}

