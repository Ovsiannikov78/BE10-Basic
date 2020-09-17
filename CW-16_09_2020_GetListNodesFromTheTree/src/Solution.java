import java.util.*;

/**
 * Дано дерево.
 * Написать метод List<Integer> getListNodes( Node root), который соберёт значение всех Node
 * в List с верху вниз, слева на право - горизонтальный обход дерева по уровням (level-ordered)
 * <p>
 * 8
 * / \
 * 5   11
 * /   / \
 * 13  4   14
 */
public class Solution {
    public static void main(String[] args) {
        Node threeLeft = new Node(null, null, 13);
        Node fourLeft = new Node(null, null, 4);
        Node fourRight = new Node(null, null, 14);
        Node twoLeft = new Node(threeLeft, null, 5);
        Node twoRight = new Node(fourLeft, fourRight, 11);
        Node one = new Node(twoLeft, twoRight, 8);

        System.out.println(getListNodes(one));

    }

    public static List<Integer> getListNodes(Node root) {
        List<Integer> nodes = new ArrayList<>();
        Deque<Node> nodeDeque = new ArrayDeque<>();
        nodeDeque.push(root);
        while (!nodeDeque.isEmpty()) {
            if (nodeDeque.getLast().left != null) {
                nodeDeque.push(nodeDeque.getLast().left);
            }
            if (nodeDeque.getLast().right != null) {
                nodeDeque.push(nodeDeque.getLast().right);
            }
            nodes.add(nodeDeque.removeLast().data);
        }
        return nodes;
    }
}