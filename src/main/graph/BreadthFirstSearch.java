package main.graph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by prajesh on 4/8/16.
 */
public class BreadthFirstSearch {

    static class WeightedGraph{
        int vertexCount;
        int[][] adjMatrix;

        WeightedGraph(int n){
            vertexCount=n;
            adjMatrix = new int[n][n];
        }

        void addEdge(int s, int d, int weight){

            if(s <= vertexCount && d <= vertexCount ){
                adjMatrix[s-1][d-1] = weight;
                adjMatrix[d-1][s-1] = weight;
            }

        }

        List<Integer> getNeighbours(int source){
            List<Integer> neighbours = new ArrayList<Integer>();

            for(int i=0;i<vertexCount;i++){
                if(adjMatrix[source][i]!=0)
                    neighbours.add(i);
            }

            return neighbours;
        }



        public int[] getWeights(int source){

            //source should be 0 based;
            source--;

            int[] distance = new int[vertexCount];

            for(int i=0;i<distance.length;i++)
                distance[i]=-1;

            Queue queue = new LinkedBlockingDeque();

            queue.add(source);

            distance[source] = 0;

            while(!queue.isEmpty()){

                int v = (Integer) queue.poll();

                for(int neighbour :  getNeighbours(v)){

                    if(distance[neighbour]==-1){

                        distance[neighbour]=distance[v] + adjMatrix[v][neighbour];
                        queue.add(neighbour);
                    }

                }


            }

            return distance;

        }


    }


    public static void main(String[] main){

        int totalCases;

        Scanner scanner = null;

        try {
             scanner = new Scanner(new FileInputStream("/Users/prajesh/Downloads/bfs_input01.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

     //   Scanner scanner = new Scanner(System.in);
        totalCases = scanner.nextInt();

        int curr=0;

        WeightedGraph[] graphs = new WeightedGraph[totalCases];
        int[] srcs = new int[totalCases];

        while(curr<totalCases){

            int vCount = scanner.nextInt();
            int edgeCount = scanner.nextInt();

            graphs[curr] =  new WeightedGraph(vCount);

            for(int i=0;i<edgeCount;i++){
                graphs[curr].addEdge(scanner.nextInt(), scanner.nextInt(), 6);
            }

            srcs[curr] = scanner.nextInt();


            curr++;
        }


        curr=0;

        while(curr<totalCases){

            int[] distances = graphs[curr].getWeights(srcs[curr]);

            for(int i =0;i<distances.length;i++){
                if(distances[i]!=0 )
                    System.out.print(distances[i] + " ");
            }

            System.out.println();
            curr++;
        }


    }





}
