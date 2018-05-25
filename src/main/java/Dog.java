import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Dog {
    private String name;
    private Breed breed;
    private double age;

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String name, double age, Breed breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public static boolean checkSameNames(List<Dog> dogList){
        List<String> nameList = new ArrayList<>();
        for(int i=0; i<dogList.size();i++){
            String name = dogList.get(i).getName();
            nameList.add(name);
        }

        HashSet<String> newSet = new HashSet<>();
        for(String name:nameList){
            newSet.add(name);
        }

        if(nameList.size() - newSet.size() != 0){
            return true;
        }
        else{
            return false;
        }
    }




    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik", 1.2, Breed.COLLIE);
        Dog rex = new Dog("Rex", 5, Breed.BULLDOG);
        Dog meggy = new Dog("Meggy", 2.0, Breed.SPANIEL);
        Dog meggy2 = new Dog("Meggy", 3.1, Breed.RETRIEVER);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(sharik);
        dogList.add(rex);
        dogList.add(meggy);
        dogList.add(meggy2);


        System.out.println(checkSameNames(dogList));

    }
}
