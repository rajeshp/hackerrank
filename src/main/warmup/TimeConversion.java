package main.warmup;

import java.io.*;
import java.util.*;
/**
 * Created by prajesh on 16/06/15.
 */
public class TimeConversion {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String time = scanner.next();

        int hour = 0;

        if(time.endsWith("PM"))
        {
            if(!time.startsWith("12")) {
                hour = Integer.parseInt(time.substring(0, 2)) + 12;
            }
            else
            {
                hour = Integer.parseInt(time.substring(0, 2)) ;
            }

            System.out.println(hour + time.substring(2, time.length() - 2));
        }
        else
        {
            if(!time.startsWith("12"))
                System.out.println(time.substring(0,time.length()-2));
            else {
                hour = 00;
                System.out.println("00" + time.substring(2, time.length() - 2));
            }

        }





    }

}
