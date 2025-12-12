package Java.Methods;

abstract class absMeth {
    abstract void check(String name);
}

public class abs extends absMeth {
    @Override
    void check(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        abs obj = new abs();
        obj.check("Abstract Method");
    }
}