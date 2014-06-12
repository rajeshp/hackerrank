import java.util.Scanner;

/**
 * Created by prajesh on 6/11/2014.
 */
public class ServiceLane {


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int T = scanner.nextInt();

        String strLaneWidth = scanner.nextLine();
        String[] laneWidths = strLaneWidth.split(" ");

        int[] laneWdithsIntArr = new int[N];



        if(laneWdithsIntArr.length == laneWidths.length) {

            for(int i=0;i<=N;i++)
            {
                laneWdithsIntArr[i] = Integer.parseInt(laneWidths[i]);
            }


            for (int i = 0; i < T; i++) {
                System.out.println(findVehicle(laneWdithsIntArr, scanner.nextInt(), scanner.nextInt()));
            }

        }
        else
        {
            System.out.println("String parsing error of service lane array");
        }
    }


    static int findVehicle(int[] laneWidths, int entry, int exit)
    {
        int min_width=entry;

        for(int i=entry;i<=exit;i++)
        {
            if(laneWidths[i] < min_width)
                min_width = laneWidths[i];

        }


      return min_width;
    }

}
