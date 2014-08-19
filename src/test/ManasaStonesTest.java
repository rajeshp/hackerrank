package test;

import main.ManasaStones;

import java.io.*;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by prajesh on 19/08/14.
 */
public class ManasaStonesTest {

    public static void main(String[] args) {


        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("resources/manasastone_actualOutput"));

            Scanner scanner = new Scanner(new InputStreamReader(new FileInputStream("resources/manasastones_input")));

            int totalCases = scanner.nextInt();

            for(int i=0;i<totalCases;i++) {

               long[] result1 = ManasaStones.lastStoneValues(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

                printLongArray(result1, bw);

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


    static void printLongArray(long[] arr, BufferedWriter bw) throws IOException
    {


        for(int i=0;i<arr.length;i++)
            bw.write(arr[i]+" ");

        bw.write("\n");

        bw.flush();


    }


}
