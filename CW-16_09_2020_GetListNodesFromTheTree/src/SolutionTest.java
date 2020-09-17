import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 8
 * / \
 * 5   11
 * /   / \
 * 13  4   14
 */

public class SolutionTest {
    Node l3 = new Node(null, null, 13);
    Node l4 = new Node(null, null, 4);
    Node r4 = new Node(null, null, 14);
    Node l2 = new Node(l3, null, 5);
    Node r2 = new Node(l4, r4, 11);
    Node root = new Node(l2, r2, 8);

    @Test
    public void testGetNodesList_1() {
        List<Integer> exp = Arrays.asList(8, 5, 11, 13, 4, 14);
        List<Integer> akt = Solution.getListNodes(root);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testGetNodesList_2() {
        List<Integer> exp = Arrays.asList(8, 5, 13, 11, 4, 14);
        List<Integer> akt = Solution.getListNodes(root);

        Assert.assertNotEquals(exp, akt);
    }
}
