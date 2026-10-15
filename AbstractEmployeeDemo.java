public class AbstractEmployeeDemo {
    public static void main(String[] args) {

        System.out.println("--- Developer ---");

        // Superclass reference
        Employee e1 = new Developer(101, "Rahul", 50000);
        e1.displayEmployee();
        e1.calculateSalary();

        System.out.println("\n--- Manager ---");

        // Superclass reference
        Employee e2 = new Manager(102, "Priya", 70000);
        e2.displayEmployee();
        e2.calculateSalary();
    }
}

abstract class Employee {
    protected int empId;
    protected String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;

        System.out.println("Employee constructor executed");
    }

    // Abstract method
    abstract void calculateSalary();

    // Normal method
    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }
}

class Developer extends Employee {
    private double basicSalary;

    Developer(int empId, String name, double basicSalary) {
        super(empId, name);
        this.basicSalary = basicSalary;

        System.out.println("Developer constructor executed");
    }

    // Implementing abstract method
    @Override
    void calculateSalary() {
        double salary = basicSalary + 10000;
        System.out.println("Developer Salary: " + salary);
    }
}

class Manager extends Employee {
    private double basicSalary;

    Manager(int empId, String name, double basicSalary) {
        super(empId, name);
        this.basicSalary = basicSalary;

        System.out.println("Manager constructor executed");
    }

    // Implementing abstract method
    @Override
    void calculateSalary() {
        double salary = basicSalary + 25000;
        System.out.println("Manager Salary: " + salary);
    }
