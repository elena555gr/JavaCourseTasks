import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Task6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("fgsgs");
        list.add("dtrjyt");
        list.add("dnynge");
        list.add("afthyt");
        list.add("9i87v");
        list.add(".,du8");
        System.out.println(list);
        System.out.println(sortAList(list));
    }

    public static List<String> sortAList(List<String> list){
        List<String> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        return sortedList;
    }
}
