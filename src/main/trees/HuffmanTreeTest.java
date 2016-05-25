package main.trees;

/**
 * Created by prajesh on 20/09/15.
 */
public class HuffmanTreeTest {

    public static void main(String[] args)
    {
        HuffmanEncoding he = new HuffmanEncoding();

        HuffmanEncoding.Node root = new HuffmanEncoding(). new Node();

        root.data='\0';
        root.frequency=5;

        he.root = root;



        HuffmanEncoding.Node node1 = new HuffmanEncoding(). new Node();
        node1.data='\0';
        node1.frequency=2;

        HuffmanEncoding.Node node2 = new HuffmanEncoding(). new Node();
        node2.data='\0';
        node2.frequency=3;

        HuffmanEncoding.Node node3 = new HuffmanEncoding(). new Node();
        node3.data='B';
        node3.frequency=1;


        HuffmanEncoding.Node node4 = new HuffmanEncoding(). new Node();
        node4.data='C';
        node4.frequency=1;


        HuffmanEncoding.Node node5 = new HuffmanEncoding(). new Node();
        node5.data='A';
        node5.frequency=1;


        HuffmanEncoding.Node node6 = new HuffmanEncoding(). new Node();
        node6.data='D';
        node6.frequency=1;

        root.left=node1;
        root.right = node2;

        node1.left=node3;
        node1.right=node4;

        node2.left=node5;
        node2.right=node6;


        he.decode("1101000111",root);




    }

}
