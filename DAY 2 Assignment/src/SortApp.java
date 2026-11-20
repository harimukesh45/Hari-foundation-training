import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Course {
    int courseId;
    String courseName;
    int courseFee;

    Course(int courseId, String courseName, int courseFee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    void display() {
        System.out.println(courseId + "\t" + courseName + "\t" + courseFee);
    }
}

class SortApp {
    public static void main(String[] args) {
        Course c1 = new Course(1,"Java Full Stack",1200);
        Course c2 = new Course(2,"Python Full Stack",1400);
        Course c3 = new Course(3,"Data Structures",600);
        Course c4 = new Course(4,"AI prompt engineering",2200);

        List<Course> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);

        System.out.println("Ascending order");
        list.sort(Comparator.comparingInt(obj -> obj.courseFee));
        for (Course c : list) {
            c.display();
        }
        System.out.println("Descending order");
        list.sort(Comparator.comparingInt((Course obj) -> obj.courseFee).reversed());
        for (Course c : list) {
            c.display();
        }
    }
}