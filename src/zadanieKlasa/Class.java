package zadanieKlasa;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private List<Student> studentNames = new ArrayList<>();

    public Class() {
    }

    public void addStudent(Student student) {
        studentNames.add(student);
    }

    public void displayStudents() {
        if (studentNames.size() == 0) {
            System.out.println("This class has no students");
        } else {
            System.out.print("Students: ");

            for (int i = 0; i < studentNames.size(); i++) {
                System.out.print(studentNames.get(i).getName());
                if (i < studentNames.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print(".\n");
        }
    }

    public int getGirlsCount() {
        int rc = 0;
        for (int i = 0; i < studentNames.size(); i++) {
            if (studentNames.get(i).getName().endsWith("a"))
                rc++;
        }
        return rc;
    }
    //todo -  dodac metode wyliczajaca srednia wieku studentow z listy.
    public float getAverage() {
        int ageSum = 0;
        for(Student s: studentNames) {
            ageSum += s.getAge();
        }
        return (float) ageSum / studentNames.size();
    }

    public static class InnerClass2 {
    }


}
