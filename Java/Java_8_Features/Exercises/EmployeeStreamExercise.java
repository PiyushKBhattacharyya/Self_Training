package Java_8_Features.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Exercise: Employee Stream Processing
 * 
 * 1. Create an Employee class (name, age, salary).
 * 2. usage List<Employee>.
 * 3. Filter employees older than 25.
 * 4. Incrememnt their salaries by 10% using map.
 * 5. Collect into a new List and print.
 */

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + age + "): $" + salary;
    }
}

public class EmployeeStreamExercise {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 23, 50000),
            new Employee("Alice", 30, 60000),
            new Employee("Bob", 28, 55000),
            new Employee("Mike", 22, 45000)
        );

        System.out.println("Original Employees: " + employees);

        List<Employee> processedEmployees = employees.stream()
            .filter(e -> e.age > 25)
            .map(e -> new Employee(e.name, e.age, e.salary * 1.10)) // 10% raise
            .collect(Collectors.toList());

        System.out.println("\nEmployees > 25 with 10% raise:");
        processedEmployees.forEach(System.out::println);
    }
}
