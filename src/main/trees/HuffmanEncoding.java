package main.trees;

/**
 * Created by prajesh on 20/09/15.
 */
public class HuffmanEncoding {

    Node root;

    class Node {
        public int frequency; // the frequency of this tree
        public char data;
        public Node left, right;
    }






    void decode(String s, Node root){

        if(s!=null && root!=null)
        {

            System.out.println(getDecodedString(s,root,root,"",0));
        }

    }


    String getDecodedString(String s, Node root, Node current, String result, int pos){

        if(pos>=s.length() && current!=null)
            return result+current.data;
        else{

            // check if current is null, if yes begin from root again for finding the next decoded char
            if(current==null){
                return getDecodedString(s,root, root, result, pos);

            }else{

                // currently at some internal node or at leaf node


                //check if the current node is an internal node
                if(current.data=='\0'){

                    // currently at an internal node, check whether to go left or right from here

                    char c = s.charAt(pos);

                    if(c=='0')
                        return getDecodedString(s,root, current.left, result, pos+1);
                    else
                    if(c=='1')
                        return getDecodedString(s,root, current.right, result, pos+1);



                }else{
                    //current node is a leaf node, probably decoded node

                    if(current.left==null && current.right==null)
                        result +=current.data;

                    return getDecodedString(s,root, null, result, pos );
                }
            }
        }

        return result ;
    }


}
