package JavaExceptionHandling;

public class TryWithResources {

}
/*
The try-with-resources statement automatically closes all the
resources at the end of the statement. A resource is an object to be
closed at the end of the program.

Its syntax is:

try (resource declaration) {
  // use of the resource
} catch (ExceptionType e1) {
  // catch block
}

As seen from the above syntax, we declare the
try-with-resources statement by,

declaring and instantiating the resource within the try clause.
specifying and handling all exceptions that might be thrown while
closing the resource.

import java.io.*;

class Main {
  public static void main(String[] args) {
    BufferedReader br = null;
    String line;

    try {
      System.out.println("Entering try block");
      br = new BufferedReader(new FileReader("test.txt"));
      while ((line = br.readLine()) != null) {
        System.out.println("Line =>"+line);
      }
    } catch (IOException e) {
      System.out.println("IOException in try block =>" + e.getMessage());
    } finally {
      System.out.println("Entering finally block");
      try {
        if (br != null) {
          br.close();
        }
      } catch (IOException e) {
        System.out.println("IOException in finally block =>"+e.getMessage());
      }

    }
  }
 */