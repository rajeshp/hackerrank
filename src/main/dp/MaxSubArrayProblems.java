package main.dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by prajesh on 10/06/15.
 *
 * Solution for Finding MaxSubArray problems
 *
 * 1. maximum contigous subarray (Kadane's algorithm)
 * 2. maxium non-contigous subarray
 *
 */
public class MaxSubArrayProblems {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        //int[] arr = new int[]{4,-5,3,2,-9,6,25,-100};
        int[] arr = new int[]{2,-1,2,3,4,-5};

        printMaxContigousSubArray(arr);

        System.out.println();

        printMaxNonContigousSubArray(arr);

    }


   static void printMaxContigousSubArray(int[] arr)
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

        System.out.println("Max sub-contigous array sum : "+max_so_far);
        for(int i=max_start_index;i<=max_end_index;i++)
        {
            System.out.print(" "+arr[i]);
        }

    }


    static void printMaxNonContigousSubArray(int[] arr)
    {

        int max_sum=0,val=0;

        for(int i=0;i<arr.length;i++)
        {
            val = max_sum+arr[i];

            if(max_sum < val)
                max_sum = val;
        }

        System.out.println("Max Sum of non-contigous sub-array : "+max_sum);

    }


}
