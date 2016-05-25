package main;

import java.util.Scanner;

/**
 * Created by prajesh on 22/09/15.
 */
public class LargestRectangle {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

        int n =  scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = scanner.nextInt();





    System.out.println(getMax(arr));


    }

  static  int getMax(int[] arr)
    {

        int maxRectangle = 0,curr_width=0,k=1, minWidth;

        if(arr.length > 1 )
        {

            minWidth = arr[arr.length-1];

            for(int i=arr.length-1;i>=1;i--){

                minWidth = getMinWidth(arr, minWidth,i);

                curr_width = k * minWidth;
                maxRectangle = max(maxRectangle, curr_width);
                k++;
            }

        }

        return maxRectangle;
    }


    static int getMinWidth(int[] arr, int currMinWidth, int index){

        if(index==arr.length-1)
            return arr[index];

      return   arr[index] < currMinWidth ? arr[index] : currMinWidth;



    }

    static int max(int a, int b){
        return (a>b)? a :  b;
    }

    static int min(int a, int b){
        return (a>b)? b :  a;
    }
}
