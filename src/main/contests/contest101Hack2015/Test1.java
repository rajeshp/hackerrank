package main.contests.contest101Hack2015;

import java.util.*;

/**
 * Created by prajesh on 31/07/15.
 */
public class Test1 {

    static Set<String> subStringSet = new HashSet<String>();

    public static void main(String[] args)
    {

        String s = "ababab";
        int k=2,l=3, m=26;

        List<String> substrings = null;


            for(int j=k;j<l;j++)
            {
               substrings =  getSubString(s,j);
            }


        int maxCount=0, n=0;

        for(int j=0;j<substrings.size();j++)
        {
            n=findOccurenceCount(s,substrings.get(j));
            if(n > maxCount  )
                maxCount=n;
        }

        System.out.println(maxCount);

    }


   /* public static void getSubString(String s, int startIndex, int length)
    {



        for(int i=0;i<s.length();i++)
        {
            subStringSet.add(s.substring(i, length-1));
        }


    }*/


    public  static List<String> getSubString(String input, int len) {
        List<String> ans = new ArrayList<String>();
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i <= input.length() - len; i++) {
            String sub = input.substring(i, i + len);
            if (set.contains(sub)) {
                ans.add(sub);
            }
            set.add(sub);
        }
        return ans;
    }

    public static int findOccurenceCount(String str, String findStr)
    {


        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = str.indexOf(findStr,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += findStr.length();
            }
        }


        return count;
    }

}
