package JavaMap;

public class HashMap {
}
/*
The HashMap class of the Java collections framework provides
the hash table implementation of the Map interface.

Create a HashMap
In order to create a hash map, we must import the java.util.HashMap package
first. Once we import the package, here is how we can create hashmaps in Java.

// HashMap creation with 8 capacity and 0.6 load factor
HashMap<Key, Value> numbers = new HashMap<>(8, 0.6f);
In the above code, we have created a hashmap named numbers.

Here,

Key - a unique identifier used to associate each element (value) in a map
Value - elements associated by keys in a map
Notice the part new HashMap<>(8, 0.6). Here,
the first parameter is capacity and the second parameter is loadFactor.

capacity - The capacity of this hash map is 8. Meaning,
it can store 8 entries.
loadFactor - The load factor of this hashmap is 0.6.
This means, whenever our hash table is filled by 60%,
the entries are moved to a new hash table of double the size of
the original hash table.

Creating HashMap from Other Maps
Here is how we can create a hashmap containing all the elements of other maps.

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        // Creating a hashmap of even numbers
        HashMap<String, Integer> evenNumbers = new HashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("HashMap1: " + evenNumbers);

        // Creating a hash map from other hashmap
        HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("HashMap2: " + numbers);
    }
}

Insert Elements to HashMap
put() - inserts the specified key/value mapping to the map

putAll() - inserts all the entries from specified map to this map

putIfAbsent() - inserts the specified key/value mapping to the map
if the specified key is not present in the map

Access HashMap Elements
1. Using entrySet(), keySet() and values()

entrySet() - returns a set of all the key/value mapping of the map

keySet() - returns a set of all the keys of the map

values() - returns a set of all the values of the map

get() - Returns the value associated with the specified key.
Returns null if the key is not found.

getOrDefault() - Returns the value associated with the specified key.
Returns the specified default value if the key is not found.

remove(key) - returns and removes the entry associated with the specified key from the map

remove(key, value) - removes the entry from the map only if the specified
key mapped to the specified value and return a boolean value

Replace Elements
replace(key, value) - replaces the value associated with the specified key by a new value

replace(key, old, new) - replaces the old value with the new value only if old
value is already associated with the specified key

replaceAll(function) - replaces each value of the map with the result of
the specified function

Recompute Values
1. Using compute() Method

compute() - Computes a new value using the specified function.
It then associates the computed value to the specified key.

computeIfAbsent() - If the specified key is not mapped to any value,
the method will compute a new value using the specified function.
It then associates the new value with the key.

computeIfPresent() - If the specified key is already mapped to any value,
this method will compute a new value using the specified function.
It then associates the new value with the key.

clear()	Removes all the entries from the map

containsKey()	Checks if the map contains the
specified key and returns a boolean value

containsValue()	Checks if the map contains the specified
value and returns a boolean value

size()	Returns the size of the map

isEmpty()	Checks if the map is empty and returns a boolean value

*/