import org.junit.*;
import static org.junit.Assert.assertEquals;



public class FinderTest {

    int[] nullArray = null;
    int[] emptyArray = {};
    @Test
    public void findMaxTest()  {
        Finder test1 = new Finder();
        int[] array1 = {1, 3, 4, 7};
        int expected = 7;
        int actual = test1.findMax(array1);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void findMinTest() {
        Finder test2 = new Finder();
        int[] array2 = {1, 2, 5, 0, 9};
        int expected = 0;
        int actual = test2.findMin(array2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findMaxTest_Null() {
        Finder test3 = new Finder();

        int result = test3.findMax(nullArray);
        assertEquals(null, result);

    }
    @Test
    public void findMinTest_Null() {
        Finder test4 = new Finder();

        int result = test4.findMin(nullArray);
        Assert.assertEquals(null, result);
    }
    @Test
    public void findMaxTest_Empty() {
        Finder test5 = new Finder();

        int result = test5.findMax(emptyArray);
        Assert.assertEquals(null, result);
    }
    @Test
    public void findMinTest_Empty() {
        Finder test6 = new Finder();

        int result = test6.findMin(emptyArray);
        Assert.assertNull(emptyArray);
    }
}
