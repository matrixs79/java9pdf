package zadanieScrum;

public class Main {

    public static void main(String[] args) {
        TaskProvider taskProvider = new TaskProvider();

        taskProvider.showTasks();

        taskProvider.showTasksByUser("Bob");

        taskProvider.showAverageTime();
    }
}
