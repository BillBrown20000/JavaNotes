package JavaQueue;

public interface DequeInterface {

}

/*
The Deque interface of the Java collections
framework provides the functionality of a double-ended queue.
It extends the Queue interface.

Classes that implement Deque
In order to use the functionalities of the Deque interface,
we need to use classes that implement it:

ArrayDeque
LinkedList

Methods Of Deque
addFirst() - Adds the specified element at the beginning of the deque.
Throws an exception if the deque is full.

addLast() - Adds the specified element at the end of the deque.
Throws an exception if the deque is full.

offerFirst() - Adds the specified element at the beginning of the deque.
Returns false if the deque is full.

offerLast() - Adds the specified element at the end of the deque.
Returns false if the deque is full.

getFirst() - Returns the first element of the deque.
Throws an exception if the deque is empty.

getLast() - Returns the last element of the deque.
Throws an exception if the deque is empty.

peekFirst() - Returns the first element of the deque.
Returns null if the deque is empty.

peekLast() - Returns the last element of the deque.
Returns null if the deque is empty.

removeFirst() - Returns and removes the first element of the deque.
Throws an exception if the deque is empty.

removeLast() - Returns and removes the last element of the deque.
Throws an exception if the deque is empty.

pollFirst() - Returns and removes the first element of the deque.
Returns null if the deque is empty.

pollLast() - Returns and removes the last element of the deque.
Returns null if the deque is empty.

The Stack class of the Java Collections framework provides
the implementation of the stack.

push() - adds an element at the beginning of deque

pop() - removes an element from the beginning of deque

peek() - returns an element from the beginning of deque

 */
