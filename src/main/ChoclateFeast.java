package main;

import java.util.Scanner;

/**
 * Created by prajesh on 19/08/14.
 */
public class ChoclateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();


        long[] results = new long[t];

        for(int i = 0; i < t; i++){
            results[i] = Solve(in.nextInt(), in.nextInt(), in.nextInt());
        }


        for(int i = 0; i < t; i++){
            System.out.println(results[i]);
        }

    }

    private static long Solve(int N, int C, int M){

        //Write code to solve each of the test over here

        int chocs_purchased = N/C;

        int wrappers = M;

        if(chocs_purchased<M)
            return chocs_purchased;
        else
            return wrappersExchanged(chocs_purchased,wrappers);

    }

   static int wrappersExchanged(int chocsPurchased, int wrappersRequired)
    {
        if(chocsPurchased<=0) return 0;

        int totalChocs = chocsPurchased + chocsPurchased/wrappersRequired;


        if(wrappersRequired < totalChocs)
        return totalChocs + wrappersExchanged(chocsPurchased - wrappersRequired, wrappersRequired);
        else
            return totalChocs;
    }

}
