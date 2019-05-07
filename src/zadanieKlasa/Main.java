package zadanieKlasa;

public class Main {

    public static void main(String[] args) {
        Class c = new Class();

        c.displayStudents();

        c.addStudent(new Student("Jacek", 28));
        c.addStudent(new Student("Bartek", 18));
        c.addStudent(new Student("Ania", 25));
        c.addStudent(new Student("Marta", 19));
        c.addStudent(new Student("Michał", 21));

        c.displayStudents();

        int girlCounter = c.getGirlsCount();
        System.out.println(girlCounter);

    }

}
