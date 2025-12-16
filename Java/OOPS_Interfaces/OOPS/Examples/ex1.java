package Java.OOPS_Interfaces.OOPS;

public class ex1 {
    private String name;
    private float salary;

    public ex1(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public float getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setSalary(float salary) { this.salary = salary; }

    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        ex1 emp = new ex1("Employee", 10000.0f);
        emp.displayDetails();
    }
}