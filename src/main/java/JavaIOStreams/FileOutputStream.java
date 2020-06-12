package JavaIOStreams;

public class FileOutputStream {
}
/*
The FileOutputStream class of the java.io package can be used
to write data (in bytes) to the files.

It extends the OutputStream abstract class.

write() Method
write() - writes the single byte to the file output stream

write(byte[] array) - writes the bytes from the specified array to
the output stream

write(byte[] array, int start, int length) - writes the number of bytes
equal to length to the output stream from an array starting from the
position start

To clear the output stream, we can use the flush() method.
This method forces the output stream to write all data to the destination.

To close the file output stream, we can use the close() method. Once the method is called,
we cannot use the methods of FileOutputStream.

finalize()	ensures that the close() method is called

getChannel()	returns the object of FileChannel associated with the
output stream

getFD()	returns the file descriptor associated with the output stream
*/