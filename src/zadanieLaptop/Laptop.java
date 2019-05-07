package zadanieLaptop;

public class Laptop {
    private String name;
    private int grade;

    public Laptop() { }

    public Laptop(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void introduce() {
        String message = "Hi,I'm " + name + " and ";
        if(grade < 10) {
            message += "I'm a very slow laptop.";
        } else if (grade >= 10 && grade < 25){
            message += "I'm a quite decent laptop.";
        } else {
            message += "I'm a gaming machine!";
        }
        System.out.println(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //todo - dodaj sortowanie laptopow po grade oraz zabloku wyjatkiem dodanie lapota z grade < 0
}
