package JavaMap;

public class ConcurrentMap {
}
/*
The ConcurrentMap interface of the Java collections framework provides
a thread-safe map. That is, multiple threads can access the map at once
without affecting the consistency of entries in a map.

ConcurrentMap is known as a synchronized map.

It extends the Map interface.

Since ConcurrentMap is an interface, we cannot create objects from it.

In order to use the functionalities of the ConcurrentMap interface,
we need to use the class ConcurrentHashMap that implements it.

Methods of ConcurrentMap
The ConcurrentMap interface includes all the methods of the Map interface. It is because Map is the super interface of the ConcurrentMap interface.

Besides all those methods, here are the methods specific to the ConcurrentMap interface.

putIfAbsent() - Inserts the specified key/value to the map if the specified key
is not already associated with any value.

compute() - Computes an entry (key/value mapping) for the specified
key and its previously mapped value.

computeIfAbsent() - Computes a value using the specified function for
the specified key if the key is not already mapped with any value.

computeIfPresent() - Computes a new entry (key/value mapping) for the
specified key if the key is already mapped with the specified value.

forEach() - Access all entries of a map and perform the specified actions.

merge() - Merges the new specified value with the old value of the
specified key if the key is already mapped to a certain value.
If the key is not already mapped, the method simply associates the
specified value to our key.
 */
