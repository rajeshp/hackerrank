package main.contests.contest101Hack2015;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by prajesh on 25/06/15.
 */
public class SherlockAndValidString {


    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        int result=0;

        result=getMinCharsToRemove(input);

        String output = (result>1)? "NO" : "YES" ;

        System.out.println(output);


    }


    static int getMinCharsToRemove(String s)
    {

        char[] c = s.toCharArray();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();


        for(int i=0;i<c.length;i++)
        {

            if(map.containsKey(c[i]))
                map.put(c[i],map.get(c[i])+1);
            else
                map.put(c[i],1);
        }



        return 0;

    }

}
