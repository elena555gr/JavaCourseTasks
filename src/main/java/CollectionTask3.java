import java.util.*;

public class CollectionTask3 {
    public static void main(String[] args) {
        HashMap<String, String> personMap = new HashMap<>();
        personMap.put("Kennedy", "John");
        personMap.put("Bush", "George");
        personMap.put("Clinton", "Bill");
        personMap.put("Trump", "Donald");
        personMap.put("Nixon", "Richard");
        personMap.put("Washington", "George");
        personMap.put("Lincoln", "Abraham");
        personMap.put("Roosevelt", "Theodor");
        personMap.put("Franklin", "Benjamin");
        personMap.put("Obama", "Barak");

        System.out.println(personMap);
        List<String> firstNames = new ArrayList<>(personMap.values());
        Set<String> firstNamesNoDup = new HashSet<>(firstNames);

        if(firstNames.size() == firstNamesNoDup.size()){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
        System.out.println(personMap.keySet());

        personMap.entrySet().removeIf(i->i.getValue().equals("George"));
        System.out.println(personMap);
    }
}
