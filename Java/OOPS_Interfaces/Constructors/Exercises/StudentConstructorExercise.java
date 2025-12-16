package OOPS_Interfaces.Constructors.Exercises;

/*
 * Exercise: Student Constructor
 * 
 * 1. Create a class 'Student' with name and age.
 * 2. Create a default constructor that sets name="Unknown", age=0.
 * 3. Create a parameterized constructor(name, age).
 * 4. Test both in main.
 */

class Student {
    String name;
    int age;

    // Default Constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class StudentConstructorExercise {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Alice", 20);
        s2.display();
    }
}
