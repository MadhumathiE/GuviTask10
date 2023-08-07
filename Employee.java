package GuviTask10;


public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        double raiseAmount = salary * (percent / 100);
        salary += raiseAmount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "John Doe", 50000.0);
        System.out.println("Employee ID: " + employee1.getId());
        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Employee Salary: $" + employee1.getSalary());

        employee1.raiseSalary(10); // Raise salary by 10%
        System.out.println("Updated Salary after Raise: $" + employee1.getSalary());
    }
}