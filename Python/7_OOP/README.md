# 🏭 Object-Oriented Programming (OOP)

Python is a multi-paradigm language that supports OOP.

## Classes and Objects
- **Class**: Blueprint for objects.
- **Object**: Instance of a class.

## The `__init__` Method
The constructor method, called when an object is created. Used to initialize attributes.

## Self
Represents the instance of the class (like `this` in Java/JS).

## Example
```python
class Dog:
    def __init__(self, name):
        self.name = name

    def bark(self):
        return "Woof!"

d = Dog("Buddy")
print(d.name)
```
