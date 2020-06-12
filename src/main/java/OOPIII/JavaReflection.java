package OOPIII;

public class JavaReflection {
}
/*
In Java, reflection allows us to inspect and
manipulate classes, interfaces, constructors, methods, and fields at run time.

Before we learn about reflection in Java, we need to know about a Java
class named Class.

There is a class in Java named Class that keeps all the information
about objects and classes at runtime.

The object of Class describes the properties of a particular class.
This object is used to perform reflection.

forName() takes a string argument (name of a class) and returns an object
of Class.
The returned object refers to the class specified by the string.

The getClass() method uses the object of a
particular class to create a new object of Class.

We can also create objects of Class by using the .class extension.

The package java.lang.reflect provides classes that can be used for
 manipulating class members. For example,

Method class - provides information about methods in a class
Field class - provides information about fields in a class
Constructor class - provides information about constructors in a class

Reflection of a Field

We can inspect and modify different fields of a class using
various methods provided by the Field class.

getFields() - returns all public fields from the class and its superclass
getDeclaredFields() - returns all the fields of the class
getModifier() - returns the modifier of fields in integer form
set(classObject, value) - set the value of a field with the specified value
get(classObject) - get the value of a field
setAccessible(boolean) - make the private field accessible

Reflection of Java Methods

Like fields, we can inspect different methods of a class u
sing various methods provided by the Method class.

getMethods() - returns all public methods of the class and its superclass
getDeclaredMethod() - returns all methods of the class
getName() - returns the name of methods
getModifiers() - returns the access modifier of methods in integer form
getReturnType() - returns the return type of methods
 */
