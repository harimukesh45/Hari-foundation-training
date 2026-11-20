import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//course class
class Courses{
    int courseId;
    String courseName;
    int courseFee;

    //creating constructor to store values
    Courses(int courseId, String courseName, int courseFee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    @Override
    public String toString() {
        return courseId + " " + courseName + " " + courseFee;
    }
}

public class Sorting_Courses {
    // Low to High
    public static void asc(List<Courses> list) {
        System.out.println("Fee Low to High:");
        list.sort(Comparator.comparingInt(c -> c.courseFee));
        list.forEach(System.out::println);
    }

    // High to Low
    public static void desc(List<Courses> list) {
        System.out.println("Fee High to Low:");

        list.sort(
                Comparator.comparingInt((Courses c) -> c.courseFee).reversed()
        );
        list.forEach(System.out::println);
    }

    // Sort by course name
    public static void Name(List<Courses> list) {
        System.out.println("Sort By Course Name:");
        list.sort(Comparator.comparing(c -> c.courseName));
        list.forEach(System.out::println);
    }

    public static void main(String[] args)
    {
        Courses c1 = new Courses(101, "Java", 15000);
        Courses c2 = new Courses(102, "Python", 12000);
        Courses c3 = new Courses(103, "React", 15000);
        Courses c4 = new Courses(104, "SQL", 8000);
        Courses c5 = new Courses(105, "Angular", 12000);

        //list to store collection of data
        List<Courses> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        asc(list);
        desc(list);
        Name(list);
    }



}
