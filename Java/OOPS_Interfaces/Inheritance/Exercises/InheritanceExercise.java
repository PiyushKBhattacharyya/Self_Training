package OOPS_Interfaces.Inheritance.Exercises;

/*
 * Exercise: Animal Kingdom
 * 
 * 1. Create a superclass 'Animal' with method 'makeSound()'.
 * 2. Create subclasses 'Dog' and 'Cat' that extend Animal.
 * 3. Override 'makeSound()' in both to print "Bark" and "Meow".
 * 4. Test in main.
 */

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class InheritanceExercise {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.makeSound();
        myCat.makeSound();
    }
}
