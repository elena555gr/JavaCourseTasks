import java.util.*;

public class Dog implements Comparable<Dog>{

    public int compareTo(Dog dog){
        if(age==dog.age)
            return 0;
        else if(age>dog.age)
            return 1;
        else
            return -1;
    }

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
        return Objects.equals(age, dog.age);
    }



    public boolean equalsByName(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public static boolean checkIfDogsWithSameNamesExist(List<Dog> dogList){
       boolean val = false;
           for (int i = 1; i < dogList.size(); i++) {
               System.out.println("next dog" + dogList.get(i));
               System.out.println("current dog" + dogList.get(i-1));
               if (dogList.get(i).equalsByName(dogList.get(i-1))) {
                   val = true;
                   break;
               }
           }
           return val;
    }


    public static Dog findOldestDog(List<Dog> dogList){
           Collections.sort(dogList);
           return dogList.get(dogList.size()-1);
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


        System.out.println(checkIfDogsWithSameNamesExist(dogList));
        System.out.println(findOldestDog(dogList));


    }
}
