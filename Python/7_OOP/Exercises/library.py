"""
Exercise: Library System

1. Create a class 'Book' with title and author.
2. Create methods to 'display_info()'.
3. Create an object and call the method.
"""

class Book:
    def __init__(self, title, author):
        self.title = title
        self.author = author

    def display_info(self):
        print(f"Book: {self.title} by {self.author}")

b1 = Book("Harry Potter", "J.K. Rowling")
b1.display_info()
