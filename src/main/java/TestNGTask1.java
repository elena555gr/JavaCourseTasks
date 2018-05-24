import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestNGTask1 {

    public List<Object> checkRange(String[] args) {
        List<Object> bool = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            try {
                float k = Float.parseFloat(args[i]);
                if (k >= -5 &&  k <= 5) {
                    bool.add(true);
                }
                else{
                    bool.add(false);
                }
            }catch (NumberFormatException n){
                bool.add("input exception");
            }
        }
        return bool;
    }

    public List<Integer> chooseMaxAndMin(int a, int b, int c) {

        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);

        List<Integer> rez = new ArrayList<>();
        rez.add(list.get(0));
        rez.add(list.get(list.size()-1));

        return rez;
    }

}
