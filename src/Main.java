import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hired Staff Report + Salary details");
        System.out.println("-----------------------------------");

        List<Employee> employees = new ArrayList<>();
        // Adding employees and interns to the list
        employees.add(new Employee("Marco", 35, 1900));
        employees.add(new Employee("Alino", 15, 2000));
        employees.add(new Employee("Giamma", 35, 1900));
        employees.add(new Intern("Wade", 40, 5000));
        employees.add(new Employee("Flo", 47, 5000));
        employees.add(new Intern("Tony", 24, 1300));
        employees.add(new Employee("Jons", 32, 1500));
        employees.add(new Intern("Luca", 21, 1000));
        employees.add(new Employee("Dani", 29, 1600));
        employees.add(new Intern("Nico", 23, 1500));

        // Printing details of all employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Calculate and print the difference between the highest and lowest salary
        int salaryDifference = getSalaryDifference(employees);
        System.out.println("Difference between highest and lowest salary is: " + salaryDifference);

        // Find and print the second lowest salary
        findSmallestAndSecondSmallestSalary(employees);
        System.out.println();

        // Final message
        System.out.println("---> Flaco Workload Management System brought to you by FlacoCorp Economy Division \ud83e\udd86 <---");
        System.out.println("\"Ask not what your country can do for you – ask how many taxes you do owe to your country.\"");
        System.out.println("John Quackgerald Kennedy, 2025.");
    }

    // Method to calculate the difference between the highest and lowest salary
    public static int getSalaryDifference(List<Employee> employees) {
        int maxSalary = employees.get(0).getSalary();
        int minSalary = employees.get(0).getSalary();
        String maxSalaryName = employees.get(0).getName();
        String minSalaryName = employees.get(0).getName();

        // Iterate through the list of employees to find the maximum and minimum salary
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryName = employee.getName();
            }

            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryName = employee.getName();
            }
        }

        // Print the results
        System.out.println("\nHighest salary paid is received by: " + maxSalaryName + ": " + maxSalary);
        System.out.println("Lowest salary is received by: " + minSalaryName + ": " + minSalary);
        return maxSalary - minSalary; // Return the difference
    }

    // Method to find the second smallest salary
    public static void findSmallestAndSecondSmallestSalary(List<Employee> employees) {
        if (employees.size() < 1) {
            System.out.println("Error, there must be at least 1 employee listed.");
            return;
        }

        int smallestSalary = Integer.MAX_VALUE;
        int secondSmallestSalary = Integer.MAX_VALUE;
        String smallestSalaryName = "";
        String secondSmallestSalaryName = "";

        // Loop through the list of employees to find the smallest and second smallest salary
        for (Employee employee : employees) {
            int salary = employee.getSalary();
            if (salary < smallestSalary) {
                secondSmallestSalary = smallestSalary;
                secondSmallestSalaryName = smallestSalaryName;
                smallestSalary = salary;
                smallestSalaryName = employee.getName();
            } else if (salary < secondSmallestSalary && salary != smallestSalary) {
                secondSmallestSalary = salary;
                secondSmallestSalaryName = employee.getName();
            }
        }

        // Print the second smallest salary
        System.out.println("2nd lowest salary is paid to: " + secondSmallestSalaryName + ": " + secondSmallestSalary);
    }
}