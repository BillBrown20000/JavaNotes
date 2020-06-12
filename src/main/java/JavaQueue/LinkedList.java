package JavaQueue;

public class LinkedList {
}

/*
The LinkedList class of the Java collections framework provides
the functionality of the linked list data structure.

Interfaces implemented by LinkedList
Java List Interface
Java Queue Interface
Java Deque Interface

The Java LinkedList class provides a doubly linked list implementation.

Each element in a linked list is known as a node. It consists of 3 fields:

Prev - Stores an address of the previous element in the list.
It is null for the first element.

Next - Stores an address of the next element in the list.
It is null for the last element.

Data - Stores the actual data.

Elements in linked lists are not stored in sequence.
Instead, they are scattered and connected through links (Prev and Next).

Here is how we can create linked lists in Java:

LinkedList<Type> linkedList = new LinkedList<>();
Here, Type indicates the type of a linked list. For example,

// create Integer type linked list
LinkedList<Integer> linkedList = new LinkedList<>();

// create String type linked list
LinkedList<String> linkedList = new LinkedList<>();

Creating a LinkedList using Interfaces
Queue<String> animals2 = new LinkedList<>();
Deque<String> animals3 = new LinkedList<>();


*/
