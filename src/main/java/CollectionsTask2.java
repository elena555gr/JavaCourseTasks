import java.util.HashSet;


public class CollectionsTask2 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(35);
        set1.add(56);
        set1.add(7);


        set2.add(2);
        set2.add(4);
        set2.add(8);
        set2.add(76);
        set2.add(56);
        set2.add(0);



        CollectionsTask2 objUnion = new CollectionsTask2();
        System.out.println(objUnion.doUnion(set1,set2));

        CollectionsTask2 objIntersect = new CollectionsTask2();
        System.out.println(objIntersect.doIntersect(set1,set2));

    }


   private HashSet<Integer> doUnion (HashSet<Integer> set1, HashSet<Integer> set2){
       HashSet<Integer> newSet1 = new HashSet<>();
       newSet1.addAll(set1);
       newSet1.addAll(set2);
       return newSet1;
    }

    private HashSet<Integer> doIntersect (HashSet<Integer> set1, HashSet<Integer> set2){
        HashSet<Integer> newSet1 = new HashSet<>(set1);
        newSet1.retainAll(set2);
        return newSet1;
    }

}
