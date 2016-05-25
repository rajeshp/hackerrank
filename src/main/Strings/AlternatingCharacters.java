package main.Strings;

import java.util.Scanner;

/**
 * Created by prajesh on 06/07/15.
 */
public class AlternatingCharacters {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int total_cases = scanner.nextInt();

        String[] inputs = new String[total_cases];

        for(int i=0;i<total_cases;i++)
        {
            inputs[i] = scanner.next();
        }


        for(int i=0;i<total_cases;i++)
        {
            System.out.println(findCharsToDelete(inputs[i]));
        }


    }

    static int findCharsToDelete(String str)
    {
        int k=0;

        for(int i=0;i<str.length()-1;i++)
        {

            if(str.charAt(i)==str.charAt(i+1))
                k++;

        }

        return k;

    }


}
