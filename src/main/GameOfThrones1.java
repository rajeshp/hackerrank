package main;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by prajesh on 18/08/14.
 */
public class GameOfThrones1 {

    public enum response{YES, NO};

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String testCase = scanner.next();

        System.out.println(isPalindromePossible(testCase.toCharArray()));


    }

    static response isPalindromePossible(char[] anagram)
    {
        if(anagram==null || anagram.length==0)
            return response.NO;

        Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();


        for(char c : anagram)
        {
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
            {
                map.put(c,1);
            }


        }



        // find total no. of char with ODD frequency
        if(anagram.length%2==1)
        {


            int freq1=0;
            char freq1char='\0';

            for(char c : map.keySet())
            {
                if(map.get(c)%2==1)
                {
                    freq1++;
                    freq1char=c;
                }

            }

            if(freq1 > 1) return response.NO;

            map.remove(freq1char);


            if(freq1==1)
            {
                //probability of palindrome

                // check if all other characters of even frequency

                int evenFrequency=0;

                for(char c : map.keySet())
                {
                    if(map.get(c)%2==0)
                        evenFrequency++;
                    else
                        return response.NO;
                }

                return response.YES;

            }else
            {
                return response.NO;
            }


        }
        else
        {
            //handle for strings with even length

            int freq1=0;

            for(char c : map.keySet())
            {
                if(map.get(c)%2==1)
                    freq1++;

            }


            if(freq1==0)
            {


                for(char c : map.keySet())
                {
                    if(map.get(c)%2!=0)
                        return response.NO;
                }

                return response.YES;


            }
            else
                return response.NO;


        }

    }

}
