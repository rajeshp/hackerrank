package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by prajesh on 5/23/16.
 */
public class MergingCommunities {

    static Node[] communities =null;

   static class Node{
        int rank;
        int data;
        Node parent;
       Node(int x){
           data = x;
       }

    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        communities = new Node[n];

        for(int i=0;i<n;i++){
            communities[i] = new Node(i+1);

        }

        int totalCases = scanner.nextInt(), p=0, q=0;

        java.util.List<Integer> output = new ArrayList<Integer>();



        String query =null;

        for(int i=0;i<totalCases;i++){
            query = scanner.next();
            if(query.equals("M")){
                p = scanner.nextInt();
                q = scanner.nextInt();
                connect(p, q);

            }else
            if(query.equals("Q")){
                output.add(findCommunity(scanner.nextInt()));
            }

        }

        for(int x : output)
            System.out.println(x);

    }

    static int findCommunity(int n){
        if(n > 0 && n <= communities.length)
            return getRoot(communities[n-1]).data;

        return -1;
    }

    static void connect(int m , int n) {
      //  communities[m - 1] = communities[n - 1];

        Node rootN = getRoot(communities[n - 1]);
        Node rootM = getRoot(communities[m - 1]);

       // if (rootM.rank > rootN.rank){
         //   rootN.parent = rootM;
          //  pathCompression(communities[n - 1], communities[n - 1].rank);
        //}else {
            rootM.parent = rootN;
            pathCompression(communities[m - 1], communities[m - 1].rank);
        //}
    }

    static Node getRoot(Node node){
        if(node==null || node.parent==null)
            return node;

        return getRoot(node.parent);

    }


    static void pathCompression(Node node, int rank){

        Node root = getRoot(node);
        node.parent =root;
        root.rank = 1 ;

    }

}
