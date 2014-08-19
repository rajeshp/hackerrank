package main;

import java.util.*;

/**
 * Created by prajesh on 19/08/14.
 */
public class ManasaStones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total_cases = scanner.nextInt();

        List<long[]> results = new ArrayList<long[]>();

        for(int i=0;i<total_cases;i++)
        {
          results.add(lastStoneValues(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }


        for(long[] arr : results)
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }


    }

   public static long[] lastStoneValues(int N, int a, int b)
    {

        long[] result = new long[N];

        for(int i=0;i<N;i++)
        {
            if(i==0)
                result[i] = (N-1)*a;
            else
                result[i] = iterationValue(result[i-1],a,b);
        }

        Arrays.sort(result);


        Set<Long> set = new TreeSet<Long>();

        for(int i=0;i< result.length;i++)
        {
            set.add(result[i]);
        }



        long[] result1 = new long[set.size()];

        Iterator<Long> iterator = set.iterator();

        int i=0;

        while(iterator.hasNext())
        {
           result1[i++] = iterator.next();
        }

        return result1;
    }

   static long iterationValue(long t, int a, int b)
    {
        return (t-a)+b;
    }

}
