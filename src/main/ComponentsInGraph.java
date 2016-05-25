package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by prajesh on 5/23/16.
 */
public class ComponentsInGraph {

    static Node[] communities =null;

    static class Node{
        int rank;
        int data;
        Node parent;
        Node(int x){
            data = x;
        }

    }

    static int getRank(Node node){
        if(node==null) return -1;

        return node.rank;
    }

    static Node getRoot(Node node){
        if(node==null || node.parent==null)
                return node;

        return getRoot(node.parent);
    }

    public static Node makeSet(int n){
        Node node = new Node(n);

        return node;
    }

    public static void union(Node a, Node b){
        Node rootA = getRoot(a);
        Node rootB = getRoot(b);

        if(rootA.rank > rootB.rank){
            rootB.parent=rootA;
           // b.rank=0;
           // a.rank=0;
            rootA.rank++;
            pathCompression(b, rootA);
        }else{
            rootA.parent=rootB;
           // b.rank=0;
           // a.rank=0;
            rootB.rank++;

            pathCompression(a, rootB);
        }


    }

    public static Node findSet(Node node){

        return getRoot(node);
    }



    static Node pathCompression(Node node, Node root){

        if(node!=null){
            Node topRoot = getRoot(root);
            if(root!=topRoot)
                root = topRoot;
           // pathCompression(node.parent, root);
            node.parent=root;

        }

        return node;
    }


    public static void main(String[] args) {

        Node[] vertices = new Node[10];

        for(int i=0;i<10;i++)
            vertices[i] = makeSet(i+1);


        union(vertices[0],vertices[5]);
        union(vertices[1],vertices[6]);
        union(vertices[2],vertices[7]);
        union(vertices[3],vertices[8]);
        union(vertices[1],vertices[5]);


        int minRank=0, maxRank=0;

        for(int i=0;i<10;i++) {
            if(vertices[i].parent==null) {
              //   System.out.println(vertices[i].data + "   " + vertices[i].rank);

                if( vertices[i].rank < minRank)
                    minRank =  vertices[i].rank;


                if( vertices[i].rank > maxRank)
                    maxRank =  vertices[i].rank;
            }
        }

        System.out.println(minRank + " "+ maxRank);
    }

}
