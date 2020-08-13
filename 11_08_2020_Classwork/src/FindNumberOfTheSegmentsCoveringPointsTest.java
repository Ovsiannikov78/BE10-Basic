import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FindNumberOfTheSegmentsCoveringPointsTest {
        Segment s1 = new Segment(1,4);
        Segment s2 = new Segment(3,8);
        Segment s3 = new Segment(2,5);
        Segment s4 = new Segment(6,12);
        Segment s5 = new Segment(10,14);
        Segment s6 = new Segment(15,17);
        List<Segment> segments = Arrays.asList(s1,s2,s3,s4,s5,s6);

        List<Integer> points = Arrays.asList(3,7,12,16);

    @Test
    public void testFindNumberOfTheSegmentsCoveringPoints_1(){
        List<Integer> exp = Arrays.asList(3,2,2,1);
        List<Integer> akt = FindNumberOfTheSegmentsCoveringPoints.getNumberCovers(points,segments);

        Assert.assertEquals(exp,akt);
    }
    @Test
    public void testFindNumberOfTheSegmentsCoveringPoints_2(){
        List<Integer> exp = Arrays.asList(1,2,2,1);
        List<Integer> akt = FindNumberOfTheSegmentsCoveringPoints.getNumberCovers(points,segments);

        Assert.assertNotEquals(exp,akt);
    }

}

