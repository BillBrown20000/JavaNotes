package JavaIOStreams;

public class InputStreams {
}
/*
Since InputStream is an abstract class, it is
not useful by itself. However, its subclasses can be used to read data

Subclasses of InputStream
FileInputStream
ByteArrayInputStream
ObjectInputStream

Create an InputStream
// Creates an InputStream
InputStream object1 = new FileInputStream();

Methods of InputStream
read() - reads one byte of data from the input stream

read(byte[] array) - reads bytes from the stream and stores in
the specified array

available() - returns the number of bytes available in the input stream

mark() - marks the position in the input stream up
to which data has been read

reset() - returns the control to the point in the
stream where the mark was set

markSupported() - checks if the mark() and reset()
method is supported in the stream

skips() - skips and discards the specified number of
bytes from the input stream

close() - closes the input stream

 */
