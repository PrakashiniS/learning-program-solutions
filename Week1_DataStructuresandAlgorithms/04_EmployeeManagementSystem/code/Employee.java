public class Employee {
    int employeeId;
    String name;
    String position;
    double salary;
    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public void display() {
        System.out.printf("ID: %d, Name: %s, Position: %s, Salary: %.2f\n",
                employeeId, name, position, salary);
    }
}
