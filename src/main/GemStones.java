package main;

import java.util.Scanner;

/**
 * Created by prajesh on 6/12/2014.
 */
public class GemStones {

    static boolean[][] compositionTable;


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        compositionTable = new boolean[26][T];

        String[] gems = new String[T];

        for(int i=0;i<T;i++)
        {
            gems[i] = scanner.next();
            addComposition(i,gems[i]);
        }

        System.out.println(getGemElementsCount(T));

    }

    private static int getGemElementsCount(int N)
    {
        int count=0;

        for(int i=0;i<26;i++)
        {
            boolean b = true;

            for(int j=0;j<N;j++)
            {
                b = b && compositionTable[i][j];
            }

            if(b)
                count++;
        }

        return count;
    }

    private static void addComposition(int gemID, String gem)
    {
        if(gemID>=0 &&  gem!=null && gem.length() > 0) {
            for (char c : gem.toCharArray()) {
                compositionTable[(c - 97)][gemID] = true;
            }
        }
    }

}
