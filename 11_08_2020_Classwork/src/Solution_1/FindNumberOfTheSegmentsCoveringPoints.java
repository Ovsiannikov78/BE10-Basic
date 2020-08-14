package Solution_1;

import Solution_2.Segment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNumberOfTheSegmentsCoveringPoints {
    public static void main(String[] args) {
        Segment s1 = new Segment(1,4);
        Segment s2 = new Segment(3,8);
        Segment s3 = new Segment(2,5);
        Segment s4 = new Segment(6,12);
        Segment s5 = new Segment(10,14);
        Segment s6 = new Segment(15,17);
        List<Segment> segments = Arrays.asList(s1,s2,s3,s4,s5,s6);

        List<Integer> points = Arrays.asList(3,7,12,16);

        System.out.println(getNumberCovers(points, segments));

    }

    public static List<Integer> getNumberCovers(List<Integer> points, List<Segment> segments) {
        List<Integer> res = new ArrayList<>();
        for (Integer p : points) {
            int covers = 0;
            for (Segment seg : segments) {
                if (seg.getLeft() <= p && seg.getRight() >= p) {
                    covers++;
                }
            }
            res.add(covers);
        }
        return res;
    }
}

