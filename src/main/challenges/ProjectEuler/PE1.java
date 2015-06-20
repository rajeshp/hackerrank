package main.challenges.ProjectEuler;

/**
 * Created by prajesh on 10/10/14.
 */
public class PE1 {



    public static void main(String[] args)
    {

        long s3 = sumOfMultiplesOfD(3,10, 3);

        long s5 = sumOfMultiplesOfD(5,10,5);

        System.out.println(s3 + "   "+ s5);


    }



   static  long sumOfMultiplesOfD(long a1, long N, int D)
    {

        long modD = N % D;

        long an =0;

        if(modD!=0)
             an = N - modD;
        else
            an = N -  D;

        long sumD = D/2 * (a1 + an);

        return sumD;
    }
}
