package AdditionalTopics;

public class LambdaExpressions {
}
/*
The lambda expression was introduced first time in Java 8.
Its main objective to increase the expressive power of the language.

Lambda expression is, essentially, an anonymous or unnamed method.
The lambda expression does not execute on its own. Instead,
it is used to implement a method defined by a functional interface.

How to define lambda expression in Java?
(parameter list) -> lambda body

The new operator (->) used is known as an arrow operator or a lambda operator.

Types of Lambda Body
 A body with a single expression
 () -> System.out.println("Lambdas are great");

A body that consists of a block of code.
() -> {
    double pi = 3.1415;
    return pi;
};
This type of the lambda body is known as a block body.
The block body allows the lambda body to include multiple statements.
These statements are enclosed inside the braces and you have to add a
semi-colon after the braces.

Note: For the block body, you should always have a return statement.
However, the expression body does not require a return statement.



 */
