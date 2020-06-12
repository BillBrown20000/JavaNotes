package JavaReaderWriter;

public class BufferedReader {
}
/*
Working of BufferedReader
The BufferedReader maintains an internal buffer of 8192 characters.

During the read operation in BufferedReader, a chunk of characters
is read from the disk and stored in the internal buffer.
And from the internal buffer characters are read individually.

Hence, the number of communication to the disk is reduced.
This is why reading characters is faster using BufferedReader.

Methods of BufferedReader

read() Method

read() - reads a single character from the
internal buffer of the reader

read(char[] array) - reads the characters from the reader and stores
in the specified array

read(char[] array, int start, int length) - reads the number of characters
equal to length from the reader and stores in the specified array starting
from the position start

skip() Method
To discard and skip the specified number of characters,
we can use the skip() method.

Other Methods of BufferedReader

ready() 	checks if the file reader is ready to be read

mark() 	mark the position in reader up to which data has been read

reset() 	returns the control to the point in the reader where the mark
was set

*/
