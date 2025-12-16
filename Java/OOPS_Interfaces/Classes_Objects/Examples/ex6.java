package Java.OOPS_Interfaces.Classes_Objects;

import java.io.*;

class Student implements Serializable {
    private String name;
    public Student(String name) { this.name = name; }
    public String toString() { return "Student: " + name; }
}

public class ex6 {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(new Student("Alice"));
        } catch (IOException e) { e.printStackTrace(); }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s = (Student) in.readObject();
            System.out.println(s);
        } catch (Exception e) { e.printStackTrace(); }
    }
}
