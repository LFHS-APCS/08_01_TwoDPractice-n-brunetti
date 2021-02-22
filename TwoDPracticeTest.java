import org.junit.*;

public class TwoDPracticeTest extends junit.framework.TestCase {

    public static void main(String args[]) {
        TwoDPracticeTest test = new TwoDPracticeTest();
        test.test_rowSum();
        test.test_rowSumRagged();
        test.test_columnSum();
        test.test_columnSumRagged();
    }
    
    int[][] data = { {3, 2, 5},
            {2, 4, 5},
            {9, 1, 2},
            {1, 2, 6} };

    int[][] dataRagged = { {3, 2, 5},
            {1, 4, 4, 8, 13},
            {9, 1, 0, 2},
            {0, 2, 6, 3, -1, -8} };

    @Test
    public void test_rowSum() {
        TwoDPractice p = new TwoDPractice();
        assertEquals(10, p.rowSum(data, 0));
        assertEquals(11, p.rowSum(data, 1));
        assertEquals(12, p.rowSum(data, 2));
        assertEquals(9, p.rowSum(data, 3));
    }

    @Test
    public void test_rowSumRagged() {
        TwoDPractice p = new TwoDPractice();
        assertEquals(10, p.rowSum(dataRagged, 0));
        assertEquals(30, p.rowSum(dataRagged, 1));
        assertEquals(12, p.rowSum(dataRagged, 2));
        assertEquals(2, p.rowSum(dataRagged, 3));
    }

    @Test
    public void test_columnSum() {
        TwoDPractice p = new TwoDPractice();
        assertEquals(15, p.columnSum(data, 0));
        assertEquals(9, p.columnSum(data, 1));
        assertEquals(18, p.columnSum(data, 2));
    }

    @Test
    public void test_columnSumRagged() {
        TwoDPractice p = new TwoDPractice();
        assertEquals(13, p.columnSum(dataRagged, 0));
        assertEquals(9, p.columnSum(dataRagged, 1));
        assertEquals(15, p.columnSum(dataRagged, 2));
        assertEquals(13, p.columnSum(dataRagged, 3));
        assertEquals(12, p.columnSum(dataRagged, 4));
        assertEquals(-8, p.columnSum(dataRagged, 5));
    }

}
