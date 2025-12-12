package Java.OOPS_Interfaces.Classes_Objects;

class Student { public Student() {} }

public class ex4 {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("Student");
            Student s = (Student) c.getDeclaredConstructor().newInstance();
            System.out.println(s);
        } catch (Exception e) { e.printStackTrace(); }
    }
}
