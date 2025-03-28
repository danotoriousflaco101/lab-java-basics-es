class Intern extends Employee {
    private static final int MAX_SALARY = 20000; // Maximum salary for an intern

    // Constructor to initialize a new intern
    public Intern(String name, int age, int salary) {
        super(name, age, salary);
        this.setSalary(salary); // Set the salary using the setter
    }

    // Setter for the salary, with a check for the maximum salary
    public void setSalary(int salary) {
        if (salary > MAX_SALARY) {
            super.setSalary(MAX_SALARY); // Set to maximum salary if it exceeds the limit
        } else {
            super.setSalary(salary); // If not, it will set the normal salary!
        }
    }
}