package com.vaibhav.example;

public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    private static boolean left = false;
    private static boolean right = false;

    public Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public static boolean isBalanced(Node root){
        int leftHeight = 0;
        int rightHeight = 0;
        if(root == null){
            return true;
        }
        if(root.getLeftChild() != null && root != null){
            leftHeight = getHeight(root.getLeftChild());
        }
        if(root.getRightChild() != null && root != null){
            rightHeight = getHeight(root.getRightChild());
        }

        return Math.abs(leftHeight-rightHeight) > 1 ? false: true;
    }

    private static int getHeight(Node root) {
        if(root == null){
            return 0;
        }
        if(root != null && root.getLeftChild() == null && root.getRightChild() == null){
            return 1;
        }
        return 1+Math.max(getHeight(root.getLeftChild()), getHeight(root.getRightChild()));
    }

    public static boolean isBST(Node root){
        if(root == null){
            return true;
        }

        if(root != null && root.getLeftChild() != null && root.getLeftChild().getData() > root.getData()){
            return false;
        }

        if(root != null && root.getRightChild() != null && root.getRightChild().getData() < root.getData()){
            return false;
        }

        return isBST(root.getRightChild()) && isBST(root.getLeftChild());

    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
