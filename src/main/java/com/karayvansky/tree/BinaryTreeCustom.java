package com.karayvansky.tree;

public class BinaryTreeCustom {

    Node root;

    public void addNode(int key, String value) {
        Node node = new Node(key, value);

        if (root == null) {
            root = node;
            return;
        }

        Node currentNode = root;

        while (true) {
            Node parent = currentNode;
            if (key < currentNode.key) {
                currentNode = currentNode.leftChild;
                if (currentNode == null) {
                    parent.leftChild = node;
                    return;
                }
            } else {
                currentNode = currentNode.rightChild;
                if (currentNode == null) {
                    parent.rightChild = node;
                    return;
                }
            }
        }
    }

    public String getNode(int key) {

        Node currentNode = root;

        while (true) {
            if (key == currentNode.key) {
                return currentNode.value;
            }

            Node parent = currentNode;
            if (key < currentNode.key) {
                currentNode = currentNode.leftChild;
                if (currentNode == null) {
                    return null;
                }
            } else {
                currentNode = currentNode.rightChild;
                if (currentNode == null) {
                    return null;
                }
            }
        }

    }

    public void outAllNodes(Node node) {
        if (node == null) return;
        outAllNodes(node.leftChild);
        System.out.println(node);
        outAllNodes(node.rightChild);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}

class Node {
    int key;
    String value;
    Node leftChild;
    Node rightChild;

    public Node(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", key=" + key +
                '}';
    }
}


