package JavaMap;

public class ConcurrentHashMap {
}
/*
The ConcurrentHashMap class of the Java collections framework provides
a thread-safe map. That is, multiple threads can access the map at once
without affecting the consistency of entries in a map.

It implements the ConcurrentMap interface.

Bulk ConcurrentHashMap Operations
The ConcurrentHashMap class provides different bulk operations
that can be applied safely to concurrent maps.

1. forEach() Method
The forEach() method iterates over our entries and executes
the specified function.

It includes two parameters.

parallelismThreshold - It specifies that after how many elements
operations in a map are executed in parallel.
transformer - This will transform the data before the data is
passed to the specified function.
*/
