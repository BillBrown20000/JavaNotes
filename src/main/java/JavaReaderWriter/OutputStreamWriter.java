package JavaReaderWriter;

public class OutputStreamWriter {
}
/*
The OutputStreamWriter class works with other output streams.
It is also known as a bridge between byte streams and character streams.
This is because the OutputStreamWriter converts its characters into bytes.

Methods of OutputStreamWriter

write() Method

write() - writes a single character to the writer

write(char[] array) - writes the characters from the specified array
to the writer

write(String data) - writes the specified string to the writer

getEncoding() Method
The getEncoding() method can be used to get the type of encoding that is used
to write data to the output stream.

close() Method
To close the output stream writer, we can use the close() method.
Once the close() method is called, we cannot use the writer to write the data.

flush()	forces to write all the data present in the writer to the corresponding destination
append()	inserts the specified character to the current writer
*/
