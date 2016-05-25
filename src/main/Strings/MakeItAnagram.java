package main.Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by prajesh on 06/07/15.
 */
public class MakeItAnagram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

                String s1 = scanner.next();
                String s2 = scanner.next();

        System.out.println(makeItAnagram(s1,s2));



    }


    public static int makeItAnagram(String s1, String s2)
    {
        String s3 = s1+s2;

        char[] s3Chars  = s3.toCharArray();

        HashMap<Character,Integer> frequencyMap = new HashMap<Character, Integer>();

        for(int i=0;i<s3Chars.length;i++)
        {
            if(frequencyMap.containsKey(s3Chars[i]))
            {
                frequencyMap.put(s3Chars[i],frequencyMap.get(s3Chars[i])+1);
            }
            else
                frequencyMap.put(s3Chars[i],1);

        }

        int result=0;

        for(Character c : frequencyMap.keySet())
        {
            if(frequencyMap.get(c)==1)
            {
               result++;
            }

        }


        return result;

    }

}
