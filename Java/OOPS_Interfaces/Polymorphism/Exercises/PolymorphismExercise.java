package OOPS_Interfaces.Polymorphism.Exercises;

/*
 * Exercise: Shape Area
 * 
 * 1. Create a class 'Shape' with method 'area()'.
 * 2. Create subclasses 'Circle' (radius) and 'Rectangle' (length, width).
 * 3. Override 'area()' to calculate and print area for each.
 * 4. Use polymorphism to store shapes in a Shape[] array and call area().
 */

class Shape {
    public void area() {
        System.out.println("Area of generic shape");
    }
}

class Circle extends Shape {
    double radius;
    public Circle(double r) { this.radius = r; }
    
    @Override
    public void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;
    public Rectangle(double l, double w) { this.length = l; this.width = w; }
    
    @Override
    public void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

public class PolymorphismExercise {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 5);
        
        for(Shape s : shapes) {
            s.area();
        }
    }
}
