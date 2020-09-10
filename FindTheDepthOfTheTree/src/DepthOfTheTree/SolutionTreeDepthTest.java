package DepthOfTheTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTreeDepthTest {
    Node nine = new Node(null, null, 9);
    Node two = new Node(null, null, 2);
    Node eleven = new Node(null, null, 11);
    Node thirteen = new Node(eleven, null, 13);
    Node ten = new Node(nine, thirteen, 10);
    Node eight = new Node(null, ten, 8);
    Node five = new Node(two, null, 5);
    Node six = new Node(five, eight, 6);

    @Test
    public void testMaxTreeHeight_root_6_height_5() {
        int exp = 5;
        int akt = SolutionTreeDepth.treeHeight(six);
        Assertions.assertEquals(exp, akt);
    }

    @Test
    public void testMaxTreeHeight_root_5_height_2() {
        int exp = 2;
        int akt = SolutionTreeDepth.treeHeight(five);
        Assertions.assertEquals(exp, akt);
    }

    @Test
    public void testMaxTreeHeight_root_10_height_3() {
        int exp = 3;
        int akt = SolutionTreeDepth.treeHeight(ten);
        Assertions.assertEquals(exp, akt);
    }

    @Test
    public void testMaxTreeHeight_root_11_height_1() {
        int exp = 1;
        int akt = SolutionTreeDepth.treeHeight(eleven);
        Assertions.assertEquals(exp, akt);
    }
}