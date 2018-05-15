import java.util.*;
import java.util.function.Predicate;

public class Student {
   private String name;
   private Integer course;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getCourse() {
        return course;
    }
    public void setCourse(Integer course) {
        this.course = course;
    }


    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "name: " + name + " - course: " + course;
    }

    @MyAnnotation
    public static void printStudents(List<Student> students, Integer course){
        Predicate<Student> filterByCourse = s -> s.getCourse().equals(course);
        students.stream()
                .filter(filterByCourse)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Rob", 1);
        Student student2 = new Student("Bob", 1);
        Student student3 = new Student("Anna", 2);
        Student student4 = new Student("Monika", 3);
        Student student5 = new Student("Sarah", 3);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        printStudents(students, 1);


        Collections.sort(students, new NameComparator());
        System.out.println(students);
        Collections.sort(students,new CourseComparator());
        System.out.println(students);

    }

    public static class NameComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2){
            return o1.getName().compareTo(o2.getName());
        }
    }
    public static class CourseComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2){
            return o1.getCourse().compareTo(o2.getCourse());
        }
    }
}