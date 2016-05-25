package main.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by prajesh on 4/4/16.
 */
public class Graph {

    static class Node{
        int val;
        List<Edge> neighbours;

    }

    static class Edge{
        int source;
        int dest;

        int weight;

        Edge(int s, int d, int w){
            this.source=s;
            this.dest=d;
            this.weight=w;
        }
    }


    int vertexes;

    Node[] adjListArr;


    public Graph(int vertexes){

        this.vertexes = vertexes;

        adjListArr = new Node[vertexes];

    }


    public void addEdge(int source, int dest, int weight){

        Node sourceNode  = adjListArr[source-1];

        Node destNode = adjListArr[dest-1];


        Edge newEdge = new Edge(source, dest, weight);

        sourceNode.neighbours.add(newEdge);

    }



    public void bfs(int source){

        Queue<Node> queue = new LinkedBlockingDeque<Node>();

        queue.add(adjListArr[source-1]);

        while(!queue.isEmpty()){

        //    Node src = this.adjListArr[queue.poll()];


          //  List<Edge> neighours =  src.neighbours;

      //      for(Edge neighourEdge : neighours){

              //  neighourEdge.dest;

            }


        }


    }



