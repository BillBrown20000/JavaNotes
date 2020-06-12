package AdditionalTopics;

public class Generics {
}
/*
In Java, Generics helps to create classes, interfaces,
and methods that can be used with different types of objects (data).
Hence, allows us to reuse our code.

Generics does not work with primitive types (int, float, char, etc)

Working of Generics
To understand how Generics is used in Java, we can use the ArrayList
class of the Java collections framework.

The ArrayList class is an example of a generics class.
We can use ArrayList to store data of any type.

Create Generics Class
class GenericsClass<T> {

  // variable of T type
  private T data;

  public GenericsClass(T data) {
    this.data = data;
  }

  // method that return T type variable
  public T getData() {
    return this.data;
  }
}

 */
