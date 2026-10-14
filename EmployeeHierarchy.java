public class EmployeeHierarchy {
    public static void main(String[] args) {

        // Creating SeniorManager object
        SeniorManager sm = new SeniorManager(101, "Rahul", "IT", 75000);

        System.out.println("\n--- Employee Details ---");

        // Accessing inherited members
        sm.displayEmployee();

        System.out.println("\n--- Final Method ---");

        // Calling final method
        sm.companyPolicy();

        System.out.println("\n--- Salary ---");
        sm.displaySalary();
    }
}

class Employee {
    // Data members
    protected int empId;
    protected String name;

    // Constructor
    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;

        System.out.println("Employee constructor executed");
    }

    // Method
    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }

    // final method
    final void companyPolicy() {
        System.out.println("Company Policy: Employees must follow company rules.");
    }
}

class Manager extends Employee {
    protected String department;

    // Constructor
    Manager(int empId, String name, String department) {
        super(empId, name);

        this.department = department;

        System.out.println("Manager constructor executed");
    }

    // Method overriding
    @Override
    void displayEmployee() {
        super.displayEmployee();

        System.out.println("Department: " + department);
    }
}

class SeniorManager extends Manager {
    private double salary;

    // Constructor
    SeniorManager(int empId, String name, String department, double salary) {
        super(empId, name, department);

        this.salary = salary;

        System.out.println("SeniorManager constructor executed");
    }

    // Method overriding
    @Override
    void displayEmployee() {
        super.displayEmployee();

        System.out.println("Salary: " + salary);
    }

    void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}
