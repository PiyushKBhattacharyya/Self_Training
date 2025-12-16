package OOPS_Interfaces.Classes_Objects.Exercises;

/*
 * Exercise: Book Class
 * 
 * 1. Create a class 'Book' with attributes: title, author, price.
 * 2. Create a method 'displayInfo()' to print details.
 * 3. Create two objects of Book and display their info.
 */

class Book {
    String title;
    String author;
    double price;

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("-----------------");
    }
}

public class BookExercise {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "The Alchemist";
        b1.author = "Paulo Coelho";
        b1.price = 15.99;

        Book b2 = new Book();
        b2.title = "Java Programming";
        b2.author = "John Doe";
        b2.price = 29.99;

        b1.displayInfo();
        b2.displayInfo();
    }
}
