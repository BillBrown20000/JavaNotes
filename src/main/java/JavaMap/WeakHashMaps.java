package JavaMap;

public class WeakHashMaps {
}
/*
The WeakHashMap class of the Java collections framework provides
the feature of the hash table data structure

Keys of the weak hashmap are of the WeakReference type.

The object of a weak reference type can be garbage collected in Java
if the reference is no longer used in the program.

the key two of a weak hashmap is set to null and perform garbage collection, the key is removed.

It is because unlike hashmaps, keys of weak hashmaps are of weak reference type.
 This means the entry of a map are removed by the garbage collector if
 the key to that entry is no longer used. This is useful to save resources.

 */
