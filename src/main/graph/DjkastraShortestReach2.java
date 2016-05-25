package main.graph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by prajesh on 4/8/16.
 */
public class DjkastraShortestReach2 {





    static class WeightedGraph{

        static class Edge{
            int weight;
            int dest;
            int source;
            boolean visited;

            Edge(int source, int dest, int weight){
                this.source = source;

                this.weight=weight;
                this.dest=dest;
            }

        }

        int vertexCount;
        List<Edge>[] adjList;

        WeightedGraph(int n){
            vertexCount=n;
            adjList = new ArrayList[n];
        }

        void addEdge(int s, int d, int weight){

            s--; d--;

            if(s <= vertexCount && d <= vertexCount ){

                if(this.adjList[s]==null)
                    this.adjList[s] = new ArrayList<Edge>();
                if(this.adjList[d]==null)
                    this.adjList[d] = new ArrayList<Edge>();

                this.adjList[s].add(new Edge(s,d,weight));
                this.adjList[d].add(new Edge(d,s,weight));
            }

        }

        List<Edge> getNeighbours(int source){
            List<Edge> neighbours = new ArrayList<Edge>();
            return this.adjList[source];
        }


        public int[] shortestReach(int source){
            source--;

            TreeMap<Integer, Integer> priorityQueue = new TreeMap<Integer, Integer>();

            int distance[] = new int[vertexCount];
            int parent[] = new int[vertexCount];
            boolean visited[] = new boolean[vertexCount];

            //initialize distance to -1;
            for(int i=0;i<vertexCount;i++)
                distance[i]=-1;

            priorityQueue.put(0, source);
            distance[source]=0;
            parent[source]=-1;

            int d=0, prev=0;

            while(!priorityQueue.isEmpty()){

                int src = priorityQueue.pollFirstEntry().getValue();
                visited[src] = true;

                for(Edge neighbour : this.getNeighbours(src)){

                    if(!visited[neighbour.dest]){
                            d = distance[src] + neighbour.weight;

                            if(distance[neighbour.dest]==-1 || d < distance[neighbour.dest])
                                distance[neighbour.dest]  = d;

                            priorityQueue.put(d, neighbour.dest);

                    }
                }

                parent[src] = prev;
                prev = src;


            }


            return distance;

        }

    }


    public static void main(String[] main){

        int totalCases;

        Scanner scanner = null;

        try {
            scanner = new Scanner(new FileInputStream("/Users/prajesh/Downloads/input01.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //scanner = new Scanner(System.in);
        totalCases = scanner.nextInt();

        int curr=0;

        WeightedGraph[] graphs = new WeightedGraph[totalCases];
        int[] srcs = new int[totalCases];

        while(curr<totalCases){

            int vCount = scanner.nextInt();
            int edgeCount = scanner.nextInt();

            graphs[curr] =  new WeightedGraph(vCount);

            for(int i=0;i<edgeCount;i++){
                graphs[curr].addEdge(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            }

            srcs[curr] = scanner.nextInt();


            curr++;
        }


        curr=0;

        while(curr<totalCases){

            int[] distances = graphs[curr].shortestReach(srcs[curr]);

            for(int i =0;i<distances.length;i++){
                if(distances[i]!=0 )
                    System.out.print(distances[i] + " ");
            }

            System.out.println();
            curr++;
        }


    }





}
