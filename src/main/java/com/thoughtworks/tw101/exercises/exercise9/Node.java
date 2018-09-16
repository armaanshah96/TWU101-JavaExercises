package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String name;
    private Node leftChild;
    private Node rightChild;

    public Node(String name) {
        this.name = name;
    }

    // Implementation of add creates Binary SEARCH tree
    // Comparison criteria based on string natural ordering
    // Edge Case: when equal names of two Nodes, add duplicate to left binary search tree
    public void add(String nameOfNewNode) {
        if(this.name.compareTo(nameOfNewNode) >= 0) {
            if(this.leftChild != null) {
                this.leftChild.add(nameOfNewNode);
            } else {
                this.leftChild = new Node(nameOfNewNode);
            }
        } else {
            if (this.rightChild != null) {
                this.rightChild.add(nameOfNewNode);
            } else {
                this.rightChild = new Node(nameOfNewNode);
            }
        }
    }

    // implementation of in-order traversal of binary SEARCH tree
    public List<String> names() {
        return names(this, new ArrayList<String>());
    }

    // in-order traversal of BST -- helper function
    private ArrayList<String> names(Node curr, ArrayList<String> nameList) {
        if(curr == null) {
            return nameList;
        }

        nameList = names(curr.leftChild, nameList);
        nameList.add(curr.name);
        nameList = names(curr.rightChild, nameList);
        return nameList;
    }
}
