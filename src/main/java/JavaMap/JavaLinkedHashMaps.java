package JavaMap;

public class JavaLinkedHashMaps {
}
/*
The LinkedHashMap class of the Java collections framework provides
the hash table and linked list implementation of the Map interface.

The LinkedHashMap interface extends the HashMap class to store its
entries in a hash table. It internally maintains a doubly-linked list
among all of its entries to order its entries.

Creating a LinkedHashMap
In order to create a linked hashmap, we must import the
java.util.LinkedHashMap package first. Once we import the package,
here is how we can create linked hashmaps in Java.

// LinkedHashMap with initial capacity 8 and load factor 0.6
LinkedHashMap<Key, Value> numbers = new LinkedHashMap<>(8, 0.6f);

Key - a unique identifier used to associate each element (value) in a map

Value - elements associated by the keys in a map
Notice the part new LinkedHashMap<>(8, 0.6). Here,
the first parameter is capacity and the second parameter is loadFactor.

capacity - The capacity of this linked hashmap is 8. Meaning,
it can store 8 entries.

loadFactor - The load factor of this linked hashmap is 0.6.
This means, whenever our hash map is filled by 60%, the entries are
moved to a new hash table of double the size of the original hash table.


*/