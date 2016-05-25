package main.Strings;


import java.util.Scanner;

/**
 * Created by prajesh on 06/07/15.
 */
public class Pangrams {


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String result = checkIfContainsAllEnglishAlphabets(s.toLowerCase()) ? "pangram" : "not pangram";


        System.out.println(result);

    }


   static boolean checkIfContainsAllEnglishAlphabets(String s) {
        char[] strArray = s.toCharArray();

        int i = 0;

        boolean[] english_chars = new boolean[26];


        for (i = 0; i < strArray.length; i++) {


            if(strArray[i]!=' ') {
                if (!english_chars[strArray[i] - 97])
                    english_chars[strArray[i] - 97] = true;
            }
        }


        for (i = 0; i < english_chars.length; i++) {

            if (!english_chars[i])
                break;

        }


        if (i == 26)
            return true;
        else
            return false;
    }

}
