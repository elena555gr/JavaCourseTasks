import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckRange2Test {

        @Test
        public void testCheckRange() {
            TestNGTask1 obj1 = new TestNGTask1();
            String[] arr1 = {""," ","5.0","-455363636.53455452525545345656"};
            List<Object> actual = obj1.checkRange(arr1);
            List<Object> expected = new ArrayList<>();
            expected.add("input exception");
            expected.add("input exception");
            expected.add(true);
            expected.add(false);
            Assert.assertEquals(actual, expected);
        }
    }

