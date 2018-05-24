import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckRangeTest {

    @Test
    public void testCheckRange() {
        TestNGTask1 obj1 = new TestNGTask1();
        String[] arr1 = {"5.4544","3.6653","0988","fgsf"};
        List<Object> actual = obj1.checkRange(arr1);
        List<Object> expected = new ArrayList<>();
        expected.add(false);
        expected.add(true);
        expected.add(false);
        expected.add("input exception");
        Assert.assertEquals(actual, expected);
    }
}