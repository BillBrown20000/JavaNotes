package JavaReaderWriter;

public class ReaderClass {
}
/*
The Reader class of the java.io package is an abstract superclass
that represents a stream of characters.

Since Reader is an abstract class, it is not useful by itself.

Subclasses of Reader
BufferedReader
InputStreamReader
FileReader
StringReader

Methods of Reader

ready() - checks if the reader is ready to be read

read(char[] array) - reads the characters from the stream
and stores in the specified array

read(char[] array, int start, int length) - reads the number of characters
equal to length from the stream and stores in the specified array starting
from the start

mark() - marks the position in the stream up to which data has been read

reset() - returns the control to the point in the stream where the
mark is set

skip() - discards the specified number of characters from the stream


 */
