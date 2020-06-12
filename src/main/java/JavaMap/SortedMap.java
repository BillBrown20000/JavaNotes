package JavaMap;

public class SortedMap {
}
/*
The SortedMap interface of the Java collections framework provides
sorting of keys stored in a map.

Since SortedMap is an interface, we cannot create objects from it.

In order to use the functionalities of the SortedMap interface,
we need to use the class TreeMap that implements it.

To use the SortedMap, we must import the java.util.SortedMap package first.
Once we import the package, here's how we can create a sorted map.

// SortedMap implementation by TreeMap class
SortedMap<Key, Value> numbers = new TreeMap<>();
We have created a sorted map called numbers using the TreeMap class.

Methods of SortedMap
 Map is a super interface of SortedMap.

Besides all those methods, here are the methods specific to the SortedMap interface.

comparator() - returns a comparator that can be used to order keys in a map
firstKey() - returns the first key of the sorted map
lastKey() - returns the last key of the sorted map
headMap(key) - returns all the entries of a map whose keys are less than the specified key
tailMap(key) - returns all the entries of a map whose keys are greater than or equal to the specified key
subMap(key1, key2) - returns all the entries of a map whose keys lies in between key1 and key2 including key1
*/
