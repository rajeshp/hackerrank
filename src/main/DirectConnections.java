package main;

import java.util.Scanner;

/**
 * Created by prajesh on 22/10/15.
 */
public class DirectConnections {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total_cases = scanner.nextInt();
        long[] results = new long[total_cases];

        for(int i=0;i<total_cases;i++)
        {

            int cities = scanner.nextInt();

            int[] distances = new int[cities];

            int[] connections = new int[cities];



            for(int j=0;j<cities;j++){
                distances[j] = scanner.nextInt();
            }

            for(int j=0;j<cities;j++){
                connections[j] = scanner.nextInt();
            }

            //calculate the total connections

            long res = 0;

            for(int j=0;j<cities;j++){

                for(int k=j+1;k<cities-1;k++){

                     res  = res +  max(connections[j], connections[k]) * (distances[k] - distances[j]);


                }

            }

            results[i] = res % 1000000007;

        }

        for(int i=0;i<results.length;i++){
            System.out.println(results[i]);
        }

    }

   static  int max (int a, int b){

        return (a > b) ? a : b ;
    }
}
