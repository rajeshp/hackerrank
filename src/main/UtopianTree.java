package main;

import java.util.Scanner;

/**
 * Created by prajesh on 6/11/2014.
 */
public class UtopianTree {

    private static int sapling_height=1;


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int total_cases = scanner.nextInt();

        for(int i=0;i<total_cases;i++)
        {
            int height = scanner.nextInt();
            //find height of utopian tree for height h

            System.out.println(findUtopianTreeHeight(height));
        }
    }

    static int findUtopianTreeHeight(int cycles)
    {
        if (cycles < 0) return -1;

        //if(cycles==0) return 1;

        int height = sapling_height;

        for(int i=0;i<=cycles;i++)
        {
            if(i%2==0 && i > 0)
                height++;
            else
            if(i%2==1 && i >0)
                height = 2 * height;


        }

        return height;
    }

}
