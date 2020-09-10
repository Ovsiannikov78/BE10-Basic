package DepthOfTheTree;

public class SolutionTreeDepth {
    public static void main(String[] args) {

    }

    public static int treeHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
        /*return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;*/   // или так
    }

}
