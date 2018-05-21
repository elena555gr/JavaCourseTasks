import java.util.*;

public class Java8Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int n = 10;
        int[] numbers = new Random().ints(0,100).limit(n).toArray();
        Arrays.stream(numbers)
                .sorted()
                .forEach(s->list.add(s));
        System.out.println(list.get(list.size()-1));
    }
}
