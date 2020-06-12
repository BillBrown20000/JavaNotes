package JavaIOStreams;

public class ByteArrayOutputStream {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();


}
/*
In ByteArrayOutputStream maintains an
internal array of bytes to store the data.

In order to create a byte array output stream,
we must import the java.io.ByteArrayOutputStream package first.
Once we import the package, here is how we can create an output stream.

// Creates a ByteArrayOutputStream with default size
ByteArrayOutputStream out = new ByteArrayOutputStream();

we have created an output stream that will write data to an array
of bytes with default size 32 bytes. However, we can change the
default size of the array.

Methods of ByteArrayOutputStream
write() Method

write(int byte) - writes the specified byte to the output stream

write(byte[] array) - writes the bytes from the specified array
to the output stream

write(byte[] arr, int start, int length) - writes the number
of bytes equal to length to the output stream from an array
starting from the position start

writeTo(ByteArrayOutputStream out1) - writes the entire data of
the current output stream to the specified output stream

Access Data from ByteArrayOutputStream

toByteArray() - returns the array present inside the output stream

toString() - returns the entire data of the output stream in string form

close() Method

To close the output stream, we can use the close() method.

However, the close() method has no effect in ByteArrayOutputStream class.
We can use the methods of this class even after the close() method is called.

size() 	returns the size of the array in the output stream

flush() 	clears the output stream
*/
