package Java.OOPS_Interfaces.OOPS;

class Employee {
    private int id;
    private String name;

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public String getName() { return name; }
}

public class ex3 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Employee");

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
    }
}