package DepthOfTheTree;

public class Node {
    Node left;
    Node right;
    int data;

    public Node(Node left, Node right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DeptOfTheTree.Node{" +
                "left=" + left +
                ", right=" + right +
                ", data=" + data +
                '}';
    }
}
