package main.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by prajesh on 27/11/15.
 */
public class MinCoinSum {


    public static void main(String[] args) {


        System.out.println(findMinCoins(new int[]{1,3,5}, 11));

    }

    static int findMinCoins(int[] coins, int sum){

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        //put initial state 0, 0 as min no. of coins required for sum=0 is 0
        map.put(0,0);


        for(int i=1;i<=sum;i++){

            int min=Integer.MAX_VALUE, res=0;


            for (int j = 0; j < coins.length && coins[j] <= i; j++) {

                res = map.get(i-coins[j])+1;

                min = res < min ? res : min ;


            }

            map.put(i, min);

        }




        return map.get(sum);
    }

}
