package JavaQueue;

public interface QueueInterface {
}
/*
The Queue interface of the Java collections
framework provides the functionality of the queue data structure.
It extends the Collection interface.

Since the Queue is an interface, we cannot provide the direct
implementation of it.

In order to use the functionalities of Queue,
we need to use classes that implement it:

ArrayDeque
LinkedList
PriorityQueue

The Queue interface is also extended by various subinterfaces:

Deque
BlockingQueue
BlockingDeque

In Java, we must import java.util.Queue package in order to use Queue.


// LinkedList implementation of Queue
Queue<String> animal1 = new LinkedList<>();

// Array implementation of Queue
Queue<String> animal2 = new ArrayDeque<>();

// Priority Queue implementation of Queue
Queue<String> animal 3 = new PriorityQueue<>();

Some of the commonly used methods of the Queue interface are:

add() - Inserts the specified element into the queue.
If the task is successful, add() returns true, if not it throws an exception.

offer() - Inserts the specified element into the queue.
If the task is successful, offer() returns true, if not it returns false.

element() - Returns the head of the queue.
Throws an exception if the queue is empty.

peek() - Returns the head of the queue.
Returns null if the queue is empty.

remove() - Returns and removes the head of the queue.
Throws an exception if the queue is empty.

poll() - Returns and removes the head of the queue.
Returns null if the queue is empty.

 */
