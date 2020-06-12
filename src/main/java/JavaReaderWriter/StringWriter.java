package JavaReaderWriter;

public class StringWriter {
}
/*
Note: In Java, string buffer is considered as a mutable string.
That is, we can modify the string buffer. To convert from string buffer
to string, we can use the toString() method.

Methods of StringWriter

write() Method

write() - writes a single character to the string writer

write(char[] array) - writes the characters from the specified array to
the writer

write(String data) - writes the specified string to the writer

close() Method
To close the string writer, we can use the close() method.
However, the close() method has no effect in the StringWriter class.
We can use the methods of this class even after the close() method is called.

flush()	forces to write all the data present in the writer to the string buffer

append()	inserts the specified character to the current writer

*/
