package JavaQueue;

public class BlockingQueueInterface {
}
/*
The BlockingQueue interface of the Java Collections framework extends
the Queue interface. It allows any operation to wait until it can be
successfully performed.

For example, if we want to delete an element from an empty queue,
then the blocking queue allows the delete operation to wait until
the queue contains some elements to be deleted.

Since BlockingQueue is an interface,
we cannot provide the direct implementation of it.

In order to use the functionality of the BlockingQueue,
we need to use classes that implement it.

ArrayBlockingQueue
LinkedBlockingQueue

We must import the java.util.concurrent.BlockingQueue package
in order to use BlockingQueue.

// Array implementation of BlockingQueue
BlockingQueue<String> animal1 = new ArraryBlockingQueue<>();

// LinkedList implementation of BlockingQueue
BlockingQueue<String> animal2 = new LinkedBlockingQueue<>();

Methods that throw an exception
add() - Inserts an element to the blocking queue at the end of the queue.
Throws an exception if the queue is full.

element() - Returns the head of the blocking queue.
Throws an exception if the queue is empty.

remove() - Removes an element from the blocking queue.
Throws an exception if the queue is empty.

Methods that return some value

offer() - Inserts the specified element to the blocking queue at the
end of the queue. Returns false if the queue is full.

peek() - Returns the head of the blocking queue.
Returns null if the queue is empty.

poll() - Removes an element from the blocking queue.
Returns null if the queue is empty.

 */
