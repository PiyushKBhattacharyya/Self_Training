# 🧵 Java Multithreading

Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU.

## Key Concepts

1.  **Thread**: A lightweight sub-process, the smallest unit of processing.
2.  **Process**: A self-contained execution environment.
3.  **Concurrency**: Running multiple tasks in overlapping time periods.
4.  **Parallelism**: Running multiple tasks simultaneously (requires multi-core CPU).

## Creating Threads
There are two ways to create a thread:
1.  By extending `Thread` class.
2.  By implementing `Runnable` interface.

## Thread Lifecycle
- **New**: The thread is in this state if you create an instance of Thread class but before the invocation of `start()` method.
- **Runnable**: The thread is in this state after invocation of `start()` method, but the thread scheduler has not selected it to be the running thread.
- **Running**: The thread is in this state if the thread scheduler has selected it.
- **Blocked/Waiting**: The thread is in this state when it is waiting for some other thread to perform an action.
- **Terminated/Dead**: A thread is in this state when its `run()` method exits.

## Synchronization
Used to control access to shared resources by multiple threads to prevent consistency problems.
```java
synchronized(object) {
    // Shared resource access
}
```
