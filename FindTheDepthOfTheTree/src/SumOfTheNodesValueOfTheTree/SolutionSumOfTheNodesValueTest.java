package SumOfTheNodesValueOfTheTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionSumOfTheNodesValueTest {
    Node nine = new Node(null, null, 9);
    Node two = new Node(null, null, 2);
    Node eleven = new Node(null, null, 11);
    Node thirteen = new Node(eleven, null, 13);
    Node ten = new Node(nine, thirteen, 10);
    Node eight = new Node(null, ten, 8);
    Node five = new Node(two, null, 5);
    Node six = new Node(five, eight, 6);


    @Test
    public void testSumOfTheNodesValue_root_6_sum_64() {
        int exp = 64;
        int act = SolutionSumOfTheNodesValue.sumNodesValueOfTheTree(six);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testSumOfTheNodesValue_root_5_sum_7() {
        int exp = 7;
        int act = SolutionSumOfTheNodesValue.sumNodesValueOfTheTree(five);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testSumOfTheNodesValue_root_10_sum_43() {
        int exp = 43;
        int act = SolutionSumOfTheNodesValue.sumNodesValueOfTheTree(ten);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testSumOfTheNodesValue_root_11_sum_11() {
        int exp = 11;
        int act = SolutionSumOfTheNodesValue.sumNodesValueOfTheTree(eleven);
        Assertions.assertEquals(exp, act);
    }

}