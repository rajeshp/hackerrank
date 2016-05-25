package main.trees;

/**
 * Created by prajesh on 17/09/15.
 */
public class TreeTest {

  public static void main(String[] args)
  {

    Tree tree = new Tree(50);

    tree.insert(tree.root, 20);
    tree.insert(tree.root, 30);
    tree.insert(tree.root, 10);
    tree.insert(tree.root, 70);
    tree.insert(tree.root, 75);
    tree.insert(tree.root, 86);

    tree.preOrderPrint(tree.root);
  }

}
