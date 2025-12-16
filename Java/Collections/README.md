# 📚 Java Collections Framework

The Java Collections Framework provides a set of interfaces and classes to store and manipulate a group of objects.

## Hierarchy Overview
- **Iterable**
  - **Collection**
    - **List** (Ordered, duplicates allowed): `ArrayList`, `LinkedList`, `Vector`
    - **Queue** (FIFO): `PriorityQueue`, `LinkedList`
    - **Set** (Unordered, unique): `HashSet`, `LinkedHashSet`, `TreeSet`
- **Map** (Key-Value pairs): `HashMap`, `TreeMap`, `LinkedHashMap`

## Key Interfaces
1.  **List**: An ordered collection (sometimes called a sequence).
2.  **Set**: A collection that contains no duplicate elements.
3.  **Map**: An object that maps keys to values.

## Common Implementations
- `ArrayList`: Resizable array implementation of the List interface.
- `HashSet`: Implements Set interface, backed by a hash table.
- `HashMap`: Implements Map interface, Key-Value pairs.

## Iterating
```java
// Using for-each loop
for (String item : myList) {
    System.out.println(item);
}

// Using Iterator
Iterator<String> it = myList.iterator();
while(it.hasNext()) {
    System.out.println(it.next());
}
```
