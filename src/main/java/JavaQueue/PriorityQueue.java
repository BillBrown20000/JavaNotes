package JavaQueue;

public class PriorityQueue {
}
/*
The PriorityQueue class provides the
functionality of the heap data structure.

Unlike normal queues, priority queue elements are retrieved in sorted order.

Suppose, we want to retrieve elements in the ascending order.
In this case, the head of the priority queue will be the smallest element.
Once this element is retrieved, the next smallest element will be the
head of the queue.

It is important to note that the elements of a priority queue may not be
sorted. However, elements are always retrieved in sorted order.

In order to create a priority queue, we must import the
java.util.PriorityQueue package. Once we import the package,
here is how we can create a priority queue in Java.

PriorityQueue<Integer> numbers = new PriorityQueue<>();

add() - Inserts the specified element to the queue. If the queue is full, it throws an exception.

offer() - Inserts the specified element to the queue. If the queue is full, it returns false.

remove() - removes the specified element from the queue

poll() - returns and removes the head of the queue

contains(element)	Searches the priority queue for the specified element.
If the element is found, it returns true, if not it returns false.

size()	Returns the length of the priority queue.

toArray()	Converts a priority queue to an array and returns it.

 */

