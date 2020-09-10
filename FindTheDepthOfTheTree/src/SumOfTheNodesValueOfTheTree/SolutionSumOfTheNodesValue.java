package SumOfTheNodesValueOfTheTree;

public class SolutionSumOfTheNodesValue {
    public static void main(String[] args) {

    }

    public static int sumNodesValueOfTheTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = sumNodesValueOfTheTree(root.left);
        int rightHeight = sumNodesValueOfTheTree(root.right);
        return leftHeight + rightHeight + root.data;
    }
}
