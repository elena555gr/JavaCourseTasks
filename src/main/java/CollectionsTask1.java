import java.util.*;

public class CollectionsTask1 {

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList();

        for(int i=0; i<10;i++){
            myCollection.add((int)randomFill());
        }
            System.out.println(myCollection);
            myCollection.removeIf(i-> i>20);
            System.out.println(myCollection);

            if (myCollection.size()<8){
                for(int i=myCollection.size(); i<10;i++)
                myCollection.add(0);
            }
                System.out.println(myCollection);
                myCollection.add(2, 1);
                myCollection.add(8,-3);
                myCollection.add(5,-4);


             for (int i=0;i <myCollection.size();i++){
                    System.out.println("position "+ i + ", value " + myCollection.get(i));
        }
        Collections.sort(myCollection);
        System.out.println(myCollection);
        }

    public static double randomFill(){
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        return randomNum;
    }
}
