package OOPII;

public class MethodOverriding {

}
/*
In the last tutorial, we learned about inheritance.
Inheritance is an OOP property that allows us to derive a new class
(subclass) from an existing class (superclass).
The subclass inherits the attributes and methods of the superclass.

Now, if the same method is defined in both the superclass class
and the subclass class, then the method of the subclass class overrides
the method of the superclass. This is known as method overriding.

Java Overriding Rules

Both the superclass and the subclass must have the same method name,
the same return type and the same parameter list.

We cannot override the method declared as final and static.

We should always override abstract methods of the superclass
 (will be discussed in later tutorials).


class Animal {
   public void displayInfo() {
      System.out.println("I am an animal.");
   }
}

class Dog extends Animal {
   @Override
   public void displayInfo() {
      System.out.println("I am a dog.");
   }
}

class Main {
   public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.displayInfo();
   }
}
 */
