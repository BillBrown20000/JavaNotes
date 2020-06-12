package OOPII;

public class Encapsulation {

    class Stingy{
        int encapsulated;
        String inside;
        int theScope;
        public void getEcapsulations(){}
    }
}

/*
Encapsulation is one of the key features of object-oriented programing.
Encapsulation refers to the bundling of fields and methods inside a single
class.

Bundling similar fields and methods inside a class together also
helps in data hiding.

In general, encapsulation is a process of wrapping similar code in one place.

In Java, we can bundle fields and methods that operate together
inside a single class.

Java Data Hiding
Data hiding is a way of restricting the access of our data members by
hiding the implementation details.

Encapsulation also provides a way for data hiding.

Data hiding can be achieved with the help of access modifiers.
In Java, there are four access modifiers:

public - visible from anywhere

private - visible from only within the class

protected - visible within the package, and among its subclasses

default - visible within the package

In Java, encapsulation helps us to keep related fields and methods
together, which makes our code cleaner and easy to read.

It helps to control the modification of our data fields. Consider a
situation where we want the age field in a class to be non-negative.
Here we can make age private and can apply logic inside the method setAge().
 */
