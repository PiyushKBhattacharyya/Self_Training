package Java.Methods;

class userDefmeth {
    void hello() {
        System.out.println("This is a user-defined method.");
    }

    public static void main(String[] args) {
        userDefmeth obj = new userDefmeth();
        obj.hello();
    }
}