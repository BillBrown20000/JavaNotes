package JavaQueue;

public class ArrayBlockingDeque {
}
/*
The ArrayBlockingQueue class of
the Java Collections framework provides the blocking queue
implementation using an array.

In order to create an array blocking queue,
we must import the java.util.concurrent.ArrayBlockingQueue package.

Once we import the package, here is how we can create an array
blocking queue in Java:

ArrayBlockingQueue<Type> animal = new ArrayBlockingQueue<>(int capacity);
Here,

Type - the type of the array blocking queue
capacity - the size of the array blocking queue

The ArrayBlockingQueue class provides the implementation
of all the methods in the BlockingQueue interface.

These methods are used to insert, access and delete elements
 from array blocking queues.

Also, we will learn about two methods put() and take() that
support the blocking operation in the array blocking queue.

add() - Inserts the specified element to the array blocking queue.
It throws an exception if the queue is full.

offer() - Inserts the specified element to the array blocking queue.
It returns false if the queue is full.

put() method
To add an element to the end of an array blocking queue,
we can use the put() method.

If the array blocking queue is full, it waits until there
is space in the array blocking queue to add an element.

To return and remove an element from the front of the
array blocking queue, we can use the take() method.

If the array blocking queue is empty, it waits until there are
elements in the array blocking queue to be deleted.
 */
