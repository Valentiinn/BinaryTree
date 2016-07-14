package com.karayvansky.tree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTreeCustom tree = new BinaryTreeCustom();
        tree.addNode(2, "Dog");
        tree.addNode(3, "Cat");
        tree.addNode(1, "Turtle");
        tree.addNode(5, "Duck");
        tree.addNode(12, "Cat");
        tree.addNode(3, "Cat");
        tree.outAllNodes(tree.getRoot());
    }
}
