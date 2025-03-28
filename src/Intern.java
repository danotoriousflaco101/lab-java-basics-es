class Intern extends Employee {
    private static final double MAX_SALARY = (double)20000.0F;

    public Intern(String name, int age, double salary) {
        super(name, age, salary);
        this.setSalary(salary);
    }

    public void setSalary(double salary) {
        if (salary > (double)20000.0F) {
            super.setSalary((double)20000.0F);
        } else {
            super.setSalary(salary);
        }

    }
}