package main.trees;

/**
 * Created by prajesh on 17/09/15.
 */
public class AVLTree {


        class Node{
              int data;
              Node left;
              Node right;

              int height;

              Node(){

              }

             Node(int n){
          this.data = n;
        }
        }

    public AVLTree(){
      super();
    }


    public AVLTree(int n){
      super(n);
    }


  // A utility function to right rotate subtree rooted with y
// See the diagram given above.
  Node rightRotate(Node y)
  {
    Node x = y.left;
    Node T2 = x.right;

    // Perform rotation
    x.right = y;
    y.left = T2;

    // Update heights
    y.height = max(getHeight(y.left), getHeight(y.right))+1;
    x.height = max(getHeight(x.left), getHeight(x.right))+1;

    // Return new root
    return x;
  }

  // A utility function to left rotate subtree rooted with x
// See the diagram given above.
  Node leftRotate(Node x)
  {
    Node y = x.right;
    Node T2 = y.left;

    // Perform rotation
    y.left = x;
    x.right = T2;

    //  Update heights
    x.height = max(getHeight(x.left), getHeight(x.right))+1;
    y.height = max(getHeight(y.left), getHeight(y.right))+1;

    // Return new root
    return y;
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

      // calculate height of the ancestor node

        root.height =  max(getHeight(root.left), getHeight(root.right)) + 1;

      //calculate balance factor

        int balance = getBalanceFactor(root);



      // If this node becomes unbalanced, then there are 4 cases

      // Left Left Case
      if (balance > 1 && n < root.left.data)
        return rightRotate(root);

      // Right Right Case
      if (balance < -1 && n > root.right.data)
        return leftRotate(root);

      // Left Right Case
      if (balance > 1 && n > root.left.data)
      {
        root.left =  leftRotate(root.left);
        return rightRotate(root);
      }

      // Right Left Case
      if (balance < -1 && n < root.right.data)
      {
        root.right = rightRotate(root.right);
        return leftRotate(root);
      }

    /* return the (unchanged) node pointer */
      return root;

    }

    int getBalanceFactor(Node root)
    {

      if(root==null) return 0;

      return getHeight(root.left) - getHeight(root.right);

    }

    int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    int getHeight(Node root)
    {
        return root.height;
    }


  public static void main(String[] args) {

    AVLTree tree = new AVLTree();
  }

}
