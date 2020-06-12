package JavaQueue;

public class ArrayDeque {

}
/*
In Java, we can use the ArrayDeque class to
implement queue and deque data structures using arrays.

he ArrayDeque class implements these two interfaces:

Java Queue Interface
Java Deque Interface

In order to create an array deque, we must import the java.util.ArrayDeque package.

Here is how we can create an array deque in Java:

ArrayDeque<Type> animal = new ArrayDeque<>();
Here, Type indicates the type of the array deque. For example,

// Creating String type ArrayDeque
ArrayDeque<String> animals = new ArrayDeque<>();

// Creating Integer type ArrayDeque
ArrayDeque<Integer> age = new ArrayDeque<>();

add() - inserts the specified element at the end of the array deque

addFirst() - inserts the specified element at the beginning of the array deque

addLast() - inserts the specified at the end of the array deque
(equivalent to add())

Note: If the array deque is full, all these methods add(),
addFirst() and addLast() throws IllegalStateException.

offer() - inserts the specified element at the end of the array deque

offerFirst() - inserts the specified element at the beginning of
the array deque

offerLast() - inserts the specified element at the end of the array deque

 */
