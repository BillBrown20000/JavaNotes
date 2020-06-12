package OOPI;

public class InstanceOf {
    public static void main (String[] args) {
        String name = "Programiz";
        Integer age = 22;

        System.out.println("Is name an instance of String: "+ (name instanceof String));
        System.out.println("Is age an instance of Integer: "+ (age instanceof Integer));
    }

}
/*
In Java, the instanceof keyword is a binary operator.
It is used to check whether an object is an instance of a
particular class or not.

The operator also checks whether an object is an instance of
a class that implements an interface (will be discussed later in this tutorial).

The syntax of the instanceof is:
result = objectName instanceof className;
 */
