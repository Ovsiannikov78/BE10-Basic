package Solution_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoversFinder {

        /**
         *
         * @param numbers sorted list
         * @param segments
         * @return the corresponding quantities of number covers by segment
         */
    public static List<Integer> find(List<Integer> numbers, List<Segment> segments) {
        List<Point> points = collectPoints(numbers, segments);
        List<Integer> res = new ArrayList<>();

        int currentCover = 0;
        for (Point point : points) {
            if(point.status == PointStatus.DEFAULT){
                res.add(currentCover);
            }else if (point.status == PointStatus.LEFT){
                currentCover++;
            }else {
                currentCover--;
            }
        }
        return res;


    }
    public static List<Point> collectPoints(List<Integer> numbers, List<Segment> segments){
        List<Point> points = numbers.stream()
                .map(num -> new Point(num, PointStatus.DEFAULT))
                .collect(Collectors.toList());

        points.addAll(segments.stream()
                .flatMap(segment -> Stream.of(new Point(segment.getLeft(), PointStatus.LEFT),
                        new Point(segment.getRight(), PointStatus.RIGHT)))
                .collect(Collectors.toList()));

        Collections.sort(points);
        return points;
    }
}
