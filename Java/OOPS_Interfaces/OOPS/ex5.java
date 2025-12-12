package Java.OOPS_Interfaces.OOPS;

class Parent {
    public void func() {
        System.out.println("Parent.func()");
    }

    public void func(int a) {
        System.out.println("Parent.func(int): " + a);
    }
}

class Child extends Parent {
    @Override
    public void func(int a) {
        System.out.println("Child.func(int): " + a);
    }
}

public class ex5 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent obj = new Child();

        parent.func();
        parent.func(10);
        child.func(20);
        obj.func(30);
    }
}