package com.java.design.pattern.tree.merkle;

public class Node {

    private Node left;
    private Node right;
    private String hash;
    private Object data;

    public Node(Node left, Node right,Object data, String hash) {
        this.left = left;
        this.right = right;
        this.hash = hash;
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Object getData(){
        return this.data;
    }

    public void setData(Object data){
        this.data = data;
    }
}