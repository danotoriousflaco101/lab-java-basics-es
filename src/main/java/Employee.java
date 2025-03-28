class Employee {
    private String name; // Name of the employee
    private int age; // Age of the employee
    private int salary; // Salary of the employee

    // Constructor to initialize a new employee
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter for the name
    public String getName() {
        return this.name;
    }

    // Getter for the age
    public int getAge() {
        return this.age;
    }

    // Getter for the salary
    public int getSalary() {
        return this.salary;
    }

    // Setter for the salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Override of the toString method to print employee with details
    public String toString() {
        return "Employee name= " + this.name + ", age= " + this.age + ", salary= " + this.salary;
    }
}