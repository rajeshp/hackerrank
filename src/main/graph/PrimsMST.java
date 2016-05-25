package main.graph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by prajesh on 4/10/16.
 */
public class PrimsMST {


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




        int[] primMST(int source){

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
                        d =  neighbour.weight;

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





    public static void main(String[] args) {

        int totalCases;

        Scanner scanner = null;

       /* try {
            scanner = new Scanner(new FileInputStream("/Users/prajesh/Downloads/input01.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        scanner = new Scanner(System.in);

        int vertexCount = scanner.nextInt();
        int edgeCount = scanner.nextInt();

        WeightedGraph graph = new WeightedGraph(vertexCount);

        for(int i=0;i<edgeCount;i++) {

            graph.addEdge(scanner.nextInt(),scanner.nextInt(), scanner.nextInt());

        }


        int source = scanner.nextInt();

            int[] distances = graph.primMST(source);

        long sum = 0;

            for(int i =0;i<distances.length;i++){
                if(distances[i]!=0 )
                    sum+=distances[i];
            }

            System.out.println(sum);

        }






    }








