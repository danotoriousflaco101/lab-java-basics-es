import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hired Staff Report + Salary details");
        System.out.println("-----------------------------------");
        List<Employee> employees = new ArrayList();
        employees.add(new Employee("Marco", 35, (double)1900.0F));
        employees.add(new Employee("Alino", 15, (double)2000.0F));
        employees.add(new Employee("Giamma", 35, (double)1900.0F));
        employees.add(new Intern("Wade", 40, (double)5000.0F));
        employees.add(new Employee("Flo", 47, (double)5000.0F));
        employees.add(new Intern("Tony", 24, (double)1300.0F));
        employees.add(new Employee("Jons", 32, (double)1500.0F));
        employees.add(new Intern("Luca", 21, (double)1000.0F));
        employees.add(new Employee("Dani", 29, (double)1600.0F));
        employees.add(new Intern("Nico", 23, (double)1500.0F));

        for(Employee employee : employees) {
            System.out.println(employee);
        }

        double salaryDifference = getSalaryDifference(employees);
        System.out.println("Difference between highest and lowest salary is: " + salaryDifference);
        findSmallestAndSecondSmallestSalary(employees);
        System.out.println();
        System.out.println("---> Flaco Workload Management System brought to you by FlacoCorp Economy Division \ud83e\udd86 <---");
        System.out.println("\"Ask not what your country can do for you – ask how many taxes you do owe to your country.\"");
        System.out.println("John Quackgerald Kennedy, 2025.");
    }

    public static double getSalaryDifference(List<Employee> employees) {
        double maxSalary = ((Employee)employees.get(0)).getSalary();
        double minSalary = ((Employee)employees.get(0)).getSalary();
        String maxSalaryName = ((Employee)employees.get(0)).getName();
        String minSalaryName = ((Employee)employees.get(0)).getName();

        for(Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryName = employee.getName();
            }

            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryName = employee.getName();
            }
        }

        System.out.println("\nHighest salary paid is received by: " + maxSalaryName + ": " + maxSalary);
        System.out.println("Lowest salary is received by: " + minSalaryName + ": " + minSalary);
        return maxSalary - minSalary;
    }

    public static void findSmallestAndSecondSmallestSalary(List<Employee> employees) {
        if (employees.size() < 1) {
            System.out.println("Error, there must be at least 1 employees listed.");
        } else {
            double smallestSalary = Double.MAX_VALUE;
            double secondSmallestSalary = Double.MAX_VALUE;
            String smallestSalaryName = "";
            String secondSmallestSalaryName = "";

            for(Employee employee : employees) {
                double salary = employee.getSalary();
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

            System.out.println("2nd lowest salary is paid to: " + secondSmallestSalaryName + ": " + secondSmallestSalary);
        }
    }
}