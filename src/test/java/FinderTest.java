import org.junit.*;
import static org.junit.Assert.assertEquals;



public class FinderTest {

    Integer[] nullArray = null;
    Integer[] emptyArray = {};
    @Test
    public void findMaxTest()  {
        Finder test1 = new Finder();
        Integer[] array1 = {1, 3, 4, 7};
        Integer expected = 7;
        Integer actual = test1.findMax(array1);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void findMinTest() {
        Finder test2 = new Finder();
        Integer[] array2 = {1, 2, 5, 0, 9};
        Integer expected = 0;
        Integer actual = test2.findMin(array2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findMaxTest_Null() {
        Finder test3 = new Finder();

        Integer result = test3.findMax(nullArray);
        Assert.assertEquals(null, result);

    }
    @Test
    public void findMinTest_Null() {
        Finder test4 = new Finder();

        Integer result = test4.findMin(nullArray);
        Assert.assertEquals(null, result);
    }
    @Test
    public void findMaxTest_Empty() {
        Finder test5 = new Finder();

        Integer result = test5.findMax(emptyArray);
        Assert.assertEquals(null, result);
    }
    @Test
    public void findMinTest_Empty() {
        Finder test6 = new Finder();

        Integer result = test6.findMin(emptyArray);
        Assert.assertEquals(null, result);
    }
}
