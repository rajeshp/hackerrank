package main.implementation;

import java.util.Scanner;

/**
 * Created by prajesh on 22/06/15.
 */
public class Encryption {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        String input=null, output=null;


        input = scanner.nextLine();


        char[] inputArr = input.toCharArray();

        int len = inputArr.length;

        int rows = (int) Math.sqrt((double)len);

        int cols = rows;

        if(len > (rows * rows))
            cols = rows + 1;



        for(int i=0;i<cols;i++)
        {
            for(int j=i;j<len;j+=cols)
                 System.out.print(inputArr[j]);

            System.out.print(" ");

        }

    }

}
