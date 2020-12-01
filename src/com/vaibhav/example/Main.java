package com.vaibhav.example;

public class Main {

    public static void main(String[] args) {
        Node root = new Node(10);

        root.setLeftChild(new Node(6));
        root.getLeftChild().setLeftChild(new Node(4));
        root.getLeftChild().setRightChild(new Node(8));

        root.setRightChild(new Node(12));

        System.out.println(Node.isBalanced(root));

    }
}
