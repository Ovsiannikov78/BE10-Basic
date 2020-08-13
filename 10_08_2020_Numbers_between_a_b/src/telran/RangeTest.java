package telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {

    @Test
    public void testGetQtyInInterval_1and2_1() {
        assertEquals(1, Range.quantityOfNumbersFromSegment(1, 2));
    }

    @Test
    public void testGetQtyInInterval_1and3_1() {
        assertEquals(1, Range.quantityOfNumbersFromSegment(1, 3));
    }

    @Test
    public void testGetQtyInInterval_1and6_2() {
        assertEquals(2, Range.quantityOfNumbersFromSegment(1, 6));
    }

    @Test
    public void testGetQtyInInterval_2and6_2() {
        assertEquals(2, Range.quantityOfNumbersFromSegment(2, 6));
    }

    @Test
    public void testGetQtyInInterval_3and6_1() {
        assertEquals(1, Range.quantityOfNumbersFromSegment(3, 6));
    }

    @Test
    public void testGetQtyInInterval_3and8_1() {
        assertEquals(1, Range.quantityOfNumbersFromSegment(3, 8));
    }

    @Test
    public void testGetQtyInInterval_25and100_5() {
        assertEquals(5, Range.quantityOfNumbersFromSegment(25, 100));
    }

}