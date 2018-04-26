import java.util.*;

public class CollectionsTask1 {

    public static void main(String[] args) {

//create and fill with numbers
        List<Integer> myCollection = new ArrayList();
        for (int i = 0; i < 10; i++) {
            myCollection.add((int) randomFill());
        }
        System.out.println(myCollection);


//create new collection and save positions if value is more than 5
        List<Integer> newCollection = new ArrayList<>();
        for (int i=0; i<myCollection.size();i++){
            if (myCollection.get(i)>5){
                newCollection.add(i);
            }
        }

        System.out.println("new collection "+newCollection);


//remove if > 20
        myCollection.removeIf(i -> i > 20);
        System.out.println(myCollection);

//add to positions 2,8,5
        if (myCollection.size() > 7) {
            myCollection.add(2, 1);
            myCollection.add(8, -3);
            myCollection.add(5, -4);

         for (int i = 0; i < myCollection.size(); i++) {
                System.out.println("position " + i + ", value " + myCollection.get(i));
            }

//sort and print
          Collections.sort(myCollection);
          System.out.println(myCollection);
        }
    }



    public static double randomFill(){
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        return randomNum;
    }
}
