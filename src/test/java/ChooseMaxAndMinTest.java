import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ChooseMaxAndMinTest {

    @Test
    public void testChooseMaxAndMin() {
        TestNGTask1 obj = new TestNGTask1();

        List<Integer> expected = new ArrayList<>();
        expected.add(-1);
        expected.add(10);

        List<Integer> actual = obj.chooseMaxAndMin(-1, 10, 5);
        Assert.assertEquals(actual, expected);

    }
}