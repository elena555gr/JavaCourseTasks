import java.util.Arrays;
import java.util.Random;


public class Java8Task2 {
    public static void main(String[] args) {
        int n = 10;
        int[] numbers = new Random().ints(0,100).limit(n).toArray();
        Arrays.stream(numbers)
                .sorted()
                .forEachOrdered(System.out::println);
    }
}
