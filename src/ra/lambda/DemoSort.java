package ra.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoSort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"A"));
        students.add(new Student(3,"B"));
        students.add(new Student(2,"BC"));

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }
        });

        students.sort((o1,o2)->o1.getId() - o2.getId());
    }
}
