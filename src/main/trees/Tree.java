package main.trees;

/**
 * Created by prajesh on 17/09/15.
 *
 * Binary Search Tree Implementation
 *
 *
 */
public class Tree {

  class Node{
      int data;
      Node left;
      Node right;

    Node(int n){
      this.data = n ;
    }
  }

  Node root;

  public Tree(){

  }

  public Tree(Node root){
      this.root = root;
  }

  public Tree(int data){
      Node newNode = new Node(data);
      this.root = newNode;

  }


  public Node insert(Node root, int n){

    if(root==null){
      Node newNode = new Node(n);
      root = newNode;
    }
    else{

        if(root.data < n )
            root.right =  insert(root.right, n);
        else
            root.left = insert(root.left,n);

    }



    return root;
  }


  public void preOrderPrint(Node root)
  {
      if(root!=null)
      {
          System.out.print(root.data + "-->");
          preOrderPrint(root.left);
          preOrderPrint(root.right);
      }

  }


}
