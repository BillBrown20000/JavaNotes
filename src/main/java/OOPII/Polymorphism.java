package OOPII;

public class Polymorphism {
    public static void main(String[] args) {

        int x = 45;
        int y = 55;
        String a = "I am ";
        String b = "That Dude";
        System.out.println(x + y);
        System.out.println(a + b);
    }
}

/*
Polymorphism is an important concept of object-oriented programming.
It simply means more than one form. That is, the same entity
(method or operator or object) behaves differently in different scenarios.

The + operator in Java is used to perform two specific functions.
When it is used with numbers (integers and floating-point numbers),
it performs addition.
The + operator in Java is used to perform two specific functions.
When it is used with numbers
(integers and floating-point numbers), it performs addition.

In Java, Polymorphism can be divided into two types:

Run-time Polymorphism
run-time polymorphism can be achieved through method overriding.
Suppose the same method is created in the superclass and its subclasses.
In this case, the method that will be called depends upon the object used
to call the method.

Compile-time Polymorphism
The compile-time polymorphism can be achieved through
method overloading and operator overloading in Java.
 */