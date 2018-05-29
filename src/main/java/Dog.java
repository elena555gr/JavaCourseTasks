import java.util.*;

public class Dog implements Comparable<Dog>{

    private String name;
    private Breed breed;
    private double age;

    public Dog(String name, double age, Breed breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }


    @Override
    public int compareTo(Dog dog){
        if(age==dog.age)
            return 0;
        else if(age>dog.age)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public static boolean checkIfDogsWithSameNamesExist(List<Dog> dogList){
        boolean result = false;
       HashSet<String> newDogNamesList = new HashSet<>();
        for(int i=0;i<dogList.size();i++){
            if (newDogNamesList.contains(dogList.get(i).getName())){
                result = true;
            }
            else {
                newDogNamesList.add(dogList.get(i).getName());
            }
        }
        return result;
    }


    public static Dog findOldestDog(List<Dog> dogList) {

        Optional<Dog> max = dogList.stream().max(Comparator.naturalOrder());
        Dog dog = max.get();

        return dog;
    }
    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik", 1.2, Breed.COLLIE);
        Dog rex = new Dog("Rex", 5.0, Breed.BULLDOG);
        Dog meggy = new Dog("Meggy", 5.0, Breed.SPANIEL);
        Dog barky = new Dog("Barky", 3.1, Breed.RETRIEVER);
        Dog meggy2 = new Dog ("Meggy", 3.1, Breed.DALMATIAN);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(sharik);
        dogList.add(rex);
        dogList.add(meggy);
        dogList.add(barky);
        dogList.add(meggy2);

        System.out.println(checkIfDogsWithSameNamesExist(dogList));
        System.out.println(findOldestDog(dogList).getName()+" - "+findOldestDog(dogList).getBreed()+" is the oldest dog");
    }
}
