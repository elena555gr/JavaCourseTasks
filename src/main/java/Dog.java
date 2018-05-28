import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public static boolean checkIfEquals(List<Dog> dogList){
       boolean val = false;
           for (int i = 1; i < dogList.size(); i++) {
               System.out.println("next dog" + dogList.get(i));
               System.out.println("current dog" + dogList.get(i-1));
               if (dogList.get(i).equals(dogList.get(i-1))) {
                   val = true;
                   break;
               }
           }
           return val;
    }


    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik", 1.2, Breed.COLLIE);
        Dog rex = new Dog("Rex", 5, Breed.BULLDOG);
        Dog meggy = new Dog("Meggy", 2.0, Breed.SPANIEL);
        Dog meggy2 = new Dog("Meggy", 3.1, Breed.RETRIEVER);
        Dog barky = new Dog ("Barky", 3.1, Breed.DALMATIAN);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(sharik);
        dogList.add(rex);
        dogList.add(meggy);
        dogList.add(meggy2);
        dogList.add(barky);


        System.out.println(checkIfEquals(dogList));

    }
}
