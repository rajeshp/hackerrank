package test;

import main.FindDigits;
import main.ManasaStones;

import java.io.*;
import java.util.Scanner;

/**
 * Created by prajesh on 19/08/14.
 */
public class FindDigitsTest {

    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("resources/manasastone_actualOutput"));

            Scanner scanner = new Scanner(new InputStreamReader(new FileInputStream("resources/FindDigits_input")));

            int totalCases = scanner.nextInt();


            long[] inputs = new long[totalCases];
            long[]  outputs = new long[totalCases];

            for(int i=0;i<totalCases;i++)
            {
                inputs[i] = scanner.nextInt();
            }

            // process
            for(int i=0;i<totalCases;i++)
            {
                outputs[i] = FindDigits.findDivisibleDigits(inputs[i]);
            }

            //output
            for(int i=0;i<totalCases;i++)
            {
                bw.write(""+outputs[i]);
                bw.write("\n");
            }




            bw.close();


         } catch (FileNotFoundException e) {
                 e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

            }


    }


}
