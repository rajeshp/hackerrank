package main.dp;

import java.util.Scanner;

/**
 * Created by prajesh on 10/06/15.
 */
public class TheMaximumSubArray {

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

        int totalTestCases = scanner.nextInt();

        int[][] cases = new  int[totalTestCases][] ;

        for(int i=0;i<totalTestCases;i++)
        {

            int n = scanner.nextInt();

            cases[i] = new int[n];

            for(int j=0;j<n;j++)
            {
                cases[i][j] =  scanner.nextInt();
            }


        }



       // for(int i)



    }



    static int printMaxContigousSubArraySum(int[] arr)
    {

        int max_ending_here=0,max_so_far=0,max_start_index=0,max_end_index=0,val=0,current_index=0;

        for(int i=0;i<arr.length;i++)
        {
            val =   max_ending_here + arr[i];

            if(val>0)
            {
                if(max_ending_here==0)
                    current_index=i;

                max_ending_here = val;
            }
            else
            {
                max_ending_here = 0;
            }


            if(max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
                max_start_index=current_index;
                max_end_index =  i;
            }


        }

        return max_so_far;


    }


    static int printMaxNonContigousSubArray(int[] arr)
    {

        int max_sum=0,val=0;

        for(int i=0;i<arr.length;i++)
        {
            val = max_sum+arr[i];

            if(max_sum < val)
                max_sum = val;
        }

        return max_sum;

    }

}
