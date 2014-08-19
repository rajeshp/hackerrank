package main;

import java.util.Scanner;

/**
 * Created by prajesh on 6/12/2014.
 */
public class LoveLetterMystery {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);


        int T = scanner.nextInt();


        String[] originalWords = new String[T];
        int[] changesRequired = new int[T];

        for(int i=0;i<T;i++)
        {
            originalWords[i] = scanner.next();
            changesRequired[i] = palindromeOperationsRequired(originalWords[i]);
        }

        //output
        for(int i=0;i<T;i++)
        {
            System.out.println(changesRequired[i]) ;
        }



        //System.out.println(isPalindrome("ABCCBA"));


    }



    static int palindromeOperationsRequired(String word)
    {
        if(word==null || word.length()==0 || word.equals("") || isPalindrome(word)) return 0;



        StringBuilder newWord = new StringBuilder(word);

        int changesRequired=0;

        int start=0, end = word.length()-1, mid=(start+end)/2;

        while(start<=mid && end >=mid)
        {

            if(word.charAt(start)!= word.charAt(end))
            {
               changesRequired +=  Math.abs(word.charAt(start) - word.charAt(end));
            }

                start++;
                end--;

        }



        return changesRequired;

    }









    static boolean isPalindrome(String word)
    {
        if(word==null|| word.equals("") || word.length()==0) return false;

        int start=0, end = word.length()-1, mid=(start+end)/2;

        while(start<=mid && end >=mid)
        {

            if(word.charAt(start)!= word.charAt(end))
            {
                break;
            }
            else
            {
                start++;
                end--;
            }

        }

        if(start>mid || end < mid)
            return true;
        else
            return false;

    }



}
