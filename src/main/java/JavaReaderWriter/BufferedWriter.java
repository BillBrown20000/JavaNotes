package JavaReaderWriter;

public class BufferedWriter {
}
/*
Working of BufferedWriter
The BufferedWriter maintains an internal buffer of 8192 characters.

During the write operation, the characters are written to the internal
buffer instead of the disk. Once the buffer is filled or the writer is closed,
 the whole characters in the buffer are written to the disk.

Hence, the number of communication to the disk is reduced.
This is why writing characters is faster using BufferedWriter.

Methods of BufferedWriter

write() Method

write() - writes a single character to the internal buffer of the writer

write(char[] array) - writes the characters from the specified array to
the writer

write(String data) - writes the specified string to the writer

flush() Method
To clear the internal buffer, we can use the flush() method.
This method forces the writer to write all data present in the buffer to the
destination file.

close() Method
To close the buffered writer, we can use the close() method.
Once the close() method is called,
we cannot use the writer to write the data.

newLine() 	inserts a new line to the writer

append() 	inserts the specified character to the current writer
*/

