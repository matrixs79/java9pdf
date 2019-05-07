package zadanieEmloyee;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeInfoProvider {

    private List<Employee> employees = new ArrayList<>();


    public EmployeeInfoProvider() {
        loadEmployee();
    }


    private void loadEmployee() {
        this.employees = Arrays.asList(
                new Employee("programmer", 12000), //e
                new Employee("secretary", 5600), //e
                new Employee("programmer", 14000),
                new Employee("programmer", 4400)
        );

    }

    public void displayEmployees() {

        //sample 1
//        for( Employee e: employees) {
//            System.out.println(e);
//        }

        //sample 2 error
//      employees
//                .stream()
//                .map(System.out::print)
//                .collect(Collectors.toList());

        //sample 3
        employees.forEach(System.out::println);
    }

    public void displayRichEmployees() {
        List<Integer> richIds = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getSalary() > 7000) {
                richIds.add(employees.get(i).getId());
            }
        }
        System.out.print("Employees who earn more than 7K: ");
        for (int i = 0; i < richIds.size(); i++) {
                System.out.print(richIds.get(i));
            if(i < richIds.size() -1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
    }


    public void displayAnnualMean() {
        float mean = 0;
        int count = 0;

        for(Employee e: employees) {
            if(e.getPosition().equals("programmer")) {
                mean += e.getSalary() * 12;
                count ++;
            }
        }
        DecimalFormat df = new DecimalFormat("#.00");
        mean /=count;

        System.out.println("Mean annual salary for programmers is: " + df.format(mean));
    }


    public List<Employee> getEmployees() {
        return employees;
    }

}
