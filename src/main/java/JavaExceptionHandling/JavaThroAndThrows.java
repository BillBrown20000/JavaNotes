package JavaExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class JavaThroAndThrows {
    public static void findFile() throws IOException {
        // code that may produce IOException
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
/*
In Java, exceptions can be categorized into two types:

Unchecked Exceptions: They are not checked at compile-time but at run-time.For example: ArithmeticException,
 NullPointerException, ArrayIndexOutOfBoundsException, exceptions under Error class, etc.
Checked Exceptions: They are checked at compile-time. For example, IOException, InterruptedException, etc.

Usually, we don't need to handle unchecked exceptions. It's because unchecked exceptions occur due to programming errors.
And, it is a good practice to correct them instead of handling them.

We use the throws keyword in the method declaration to declare the type of exceptions that might occur within it.

throws keyword Vs. try...catch...finally
There might be several methods that can cause exceptions.
Writing try...catch for each method will be tedious and code becomes long and less-readable.
 */
