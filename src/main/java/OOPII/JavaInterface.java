package OOPII;

public interface JavaInterface {

     void thisIsAnExample();

}
/*
In Java, an interface defines
a set of specifications that other classes must implement.

Like abstract classes, we cannot create objects of interfaces.
However, we can implement interfaces in other classes.

Why use Interfaces?

Now that we know what interfaces are, let’s learn about
why interfaces are used in Java.

Interfaces provide specifications that a class
(which implements it) must follow.

In our above example, we have used thisIsAnExample() as a
specification inside the interface Polygon.
This is like setting a rule that, we should be able to get
the area of every polygon. So any class that implements
the Polygon interface must provide an
implementation for the getArea() method.

Similar to abstract classes, interfaces help us to achieve
abstraction in Java. Here, we know getArea() calculates the area
of polygons but the way area is calculated is different for
different polygons. Hence, the implementation of getArea() is
independent of one another.

Interfaces are also used to achieve multiple inheritance in Java.
If a subclass is inherited from two or more classes, it's
multiple inheritance.

In Java, multiple inheritance is not possible by extending classes.
However, a class can implement multiple interfaces.
This allows us to get the functionality of multiple inheritance in Java.
*/
