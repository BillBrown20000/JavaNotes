package OOPIII;

public class NestedAndInnerClass {

    class OuterClass{

        class NestedClass{

        }
    }

}
/*
In Java, you can define a class within another class.
Such class is known as nested class.

There are two types of nested classes you can create in Java.

Non-static nested class (inner class)
A non-static nested class is a class within another class.
It has access to members of the enclosing class (outer class).
It is commonly known as inner class.
Since the inner class exists within the outer class,
you must instantiate the outer class first,
in order to instantiate the inner class.

Static nested class
In Java, we can also define a static class inside another class.
Such class is known as static nested class. Static nested classes are not
called static inner classes.

Unlike inner class, a static nested class cannot access the member
variables of the outer class. It is because the static nested class doesn't
require you to create an instance of the outer class.
 */
