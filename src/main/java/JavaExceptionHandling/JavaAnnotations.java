package JavaExceptionHandling;

public class JavaAnnotations {
}
/*
Java annotations are metadata (data about data) for our program source code.

They provide additional information about the program to the
compiler but are not part of the program itself.
These annotations do not affect the execution of the compiled program.

The @Override annotation specifies that the method that has been marked
with this annotation overrides the method of the superclass with the
same method name, return type, and parameter list.

It is not mandatory to use @Override when overriding a method.
However, if we use it, the compiler gives an error if something is
wrong (such as wrong parameter type) while overriding the method.

Annotation formats

Annotations may also include elements (members/attributes/parameters).

Marker annotations do not contain members/elements. It is only used for marking a declaration.

Its syntax is:

@AnnotationName()
Since these annotations do not contain elements, parentheses
can be excluded. For example,

@Override
 */
