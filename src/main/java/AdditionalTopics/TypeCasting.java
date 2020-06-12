package AdditionalTopics;

public class TypeCasting         {
}
/*
Type Casting
The process of converting the value of one data type (int, float, double, etc.)
to another data type is known as typecasting.

In Java, there are 13 types of type conversion. However We will cover
The major 2

1. Widening Type Casting
In Widening Type Casting, Java automatically converts one data
type to another data type.
An example
class Main {
  public static void main(String[] args) {
    // create int type variable
    int num = 10;
    System.out.println("The integer value: " + num);

    // convert into double type
    double data = num;
    System.out.println("The double value: " + data);
  }
}

2. Narrowing Type Casting
n Narrowing Type Casting, we manually convert one data type into another using the parenthesis.
Example
class Main {
  public static void main(String[] args) {
    // create double type variable
    double num = 10.99;
    System.out.println("The double value: " + num);

    // convert into int type
    int data = (int)num;
    System.out.println("The integer value: " + data);
  }
}

*/