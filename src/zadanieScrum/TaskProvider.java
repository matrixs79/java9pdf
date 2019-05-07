package zadanieScrum;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TaskProvider {

    private Map<String, List<Task>> tasks = new LinkedHashMap<>();

    public TaskProvider() {
        tasks.put("Inprogress",
                Arrays.asList(
                        new Task("Deploy to Azure", "Bob",8),
                        new Task("Handle user input", "John",4)
                ));
        tasks.put("To do",
                Arrays.asList(
                        new Task("Connect DB", "John",10),
                        new Task("Add users", "Jessica",9),
                        new Task("Configure logging", "John",6)
                ));
        tasks.put("Done",
                Arrays.asList(
                        new Task("Prepare dataset", "Bob",7)
                ));
    }

    public void showTasks() {
        String content;
        String user;
        int time;

        for(Map.Entry<String, List<Task>> entry: tasks.entrySet()) {
            System.out.println(entry.getKey() + "(" + entry.getValue().size() + "): ");
            for (int i = 0; i < entry.getValue().size(); i++) {
                content = entry.getValue().get(i).getContent();
                user = entry.getValue().get(i).getUser();
                time = entry.getValue().get(i).getEstimatedTime();

                System.out.println("* " + content + "(" + user + ", " + time + ")");
            }
        }
    }

    public void showTasksByUser(String user) {
        int tasksByUser = 0;
        for(Map.Entry<String, List<Task>> entry: tasks.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                if(entry.getValue().get(i).getUser().equals(user)) {
                    tasksByUser ++;
                }
            }
        }
        System.out.println(user + " was assigned to " + tasksByUser + " tasks in this sprint.");
    }

    public void showAverageTime() {
        int sum = 0;
        double average;
        int tasksNumber = 0;

        for(Map.Entry<String, List<Task>> entry: tasks.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += entry.getValue().get(i).getEstimatedTime();
            }
            tasksNumber += entry.getValue().size();
        }
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        average = (double) sum / tasksNumber;
        System.out.println("Mean aproximate time per task is " + df.format(average) + ".");
    }
}
