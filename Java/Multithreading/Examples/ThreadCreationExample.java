package Multithreading.Examples;

class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread (Extends Thread) is running.");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("MyRunnable (Implements Runnable) is running.");
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        // Using Thread class
        MyThread t1 = new MyThread();
        t1.start(); // Helper method to start execution
        
        // Using Runnable interface
        MyRunnable runnable = new MyRunnable();
        Thread t2 = new Thread(runnable);
        t2.start();
        
        System.out.println("Main thread is finishing...");
    }
}
