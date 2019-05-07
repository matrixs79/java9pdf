package zadanieEmloyee;

public class Employee {
    private int id;
    private String position;
    private int salary;
    private static int COUNTER = 0;

    public Employee(String position, int salary) {
        this.id = ++COUNTER;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "(" + id + ") (" + position + "): " + salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
