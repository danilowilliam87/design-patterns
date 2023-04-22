package org.labs.composite;

public class Tree {

    private Node root;
    protected String name;

    public Tree(String name) {
        this.root = new Node(name);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
