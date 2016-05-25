package main;

/**
 * Created by prajesh on 5/22/16.
 */
public class SherlockAndBeast {

    public static void main(String[] args) {

        //for(int i=0;i<20;i++)
            System.out.println(getDecentNumber(11));
    }


  static  String getDecentNumber(int n){

        if(n <= 2)
                return "-1";  //return -1 if decent no. is not possible

        StringBuilder result = new StringBuilder();

        if(n%3==0)
        {
            for(int i=0;i<n;i++)
                result.append(5);
            n=0;
        }

        if(n%5==0)
        {
            for(int i=0;i<n;i++)
                result.append(3);

            n=0;
        }

       /* if(n > 5){

           String x =  getDecentNumber(n/5);
           if(!x.equals("-1"))
               result.append(x);

            x = getDecentNumber(n-n/5);
            if(!x.equals("-1"))
                result.append(x);

            n=0;
        }*/




        if(result.toString()=="")
            return "-1";


        return result.toString();
    }

}
