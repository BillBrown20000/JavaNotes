package OOPIII;

public class JavaSingleton {

    private static JavaSingleton singleObject;

    private JavaSingleton() {
        // constructor of the SingletonExample class
    }

    public static JavaSingleton getInstance() {
        return null;
    }
        // write code that allows us to create only one object
        // access the object as per our need
}

/*
Singleton is a design pattern rather than a feature specific to Java.
 It ensures that only one instance of a class is created.

A design pattern is like our code library that includes
various coding techniques shared by programmers around the world.

Singletons can be used while working with databases.
They can be used to create a connection pool to access the
database while reusing the same connection for all the clients.

 */
