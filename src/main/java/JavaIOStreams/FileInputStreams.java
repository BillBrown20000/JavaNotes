package JavaIOStreams;

public class FileInputStreams {
}
/*
The FileInputStream class of the java.io package can be used to read data (in bytes) from files.

It extends the InputStream abstract class

In order to create a file input stream, we must import the java.io.FileInputStream package first. Once we import the package, here is how we can create a file input stream in Java.

1. Using the path to file

FileInputStream input = new FileInputStream(stringPath);
Here, we have created an input stream that will be linked to the file specified by the path.

2. Using an object of the file

FileInputStream input = new FileInputStream(File fileObject);
Here, we have created an input stream that will be linked to the file specified by fileObject.

read() Method
read() - reads a single byte from the file

read(byte[] array) - reads the bytes from the file and stores
in the specified array

read(byte[] array, int start, int length) - reads the number of bytes
equal to length from the file and stores in the specified array starting
from the position start

import java.io.FileInputStream;

public class Main {

  public static void main(String args[]) {

     try {
        FileInputStream input = new FileInputStream("input.txt");

        System.out.println("Data in the file: ");

        // Reads the first byte
        int i = input.read();

       while(i != -1) {
           System.out.print((char)i);

           // Reads next byte from the file
           i = input.read();
        }
        input.close();
     }

     catch(Exception e) {
        e.getStackTrace();
     }
  }

We first use the available() method to check the number
of available bytes in the file input stream.

We then have used the read() method 3 times to read 3 bytes
from the file input stream.

Now, after reading the bytes we again have checked the available bytes.
This time the available bytes decreased by 3.

finalize() 	ensures that the close() method is called

getChannel() 	returns the object of FileChannel associated with the input stream

getFD() 	returns the file descriptor associated with the input stream

mark() 	mark the position in input stream up to which data has been read

reset() 	returns the control to the point in the input stream where the mark was set
 */
