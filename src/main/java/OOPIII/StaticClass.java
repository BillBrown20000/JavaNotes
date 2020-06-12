package OOPIII;

public class StaticClass {
}
/*
As learned in previous tutorials, we can have a class inside another
 class in Java. Such classes are known as nested classes. In Java,
 nested classes are of two types:

Nested non-static class (Inner class)

Nested static class.
Like regular classes, static nested classes can include both static
and non-static fields and methods.

Example


// inner class
   class Reptile {
      public void displayInfo() {
        System.out.println("I am a reptile.");
      }
   }

// static class
   static class Mammal {
      public void displayInfo() {
        System.out.println("I am a mammal.");
      }
   }
}

class Main {
   public static void main(String[] args) {
      // object creation of the outer class
      Animal animal = new Animal();

      // object creation of the non-static class
      Animal.Reptile reptile = animal.new Reptile();
      reptile.displayInfo();

      // object creation of the static nested class
      Animal.Mammal mammal = new Animal.Mammal();
      mammal.displayInfo();

   }
 */
