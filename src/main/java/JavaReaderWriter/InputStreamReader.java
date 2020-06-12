package JavaReaderWriter;

public class InputStreamReader {
}
/*
The InputStreamReader class works with other input streams.
It is also known as a bridge between byte streams and character streams.
This is because the InputStreamReader reads bytes from the input stream as
characters.

read() Method

read() - reads a single character from the reader

read(char[] array) - reads the characters from the reader and stores in
the specified array

read(char[] array, int start, int length) - reads the number of characters
equal to length from the reader and stores in the specified array starting
from the start

getEncoding() Method
The getEncoding() method can be used to get the type of encoding that
is used to store data in the input stream.

close() Method

ready()	checks if the stream is ready to be read

mark()	mark the position in stream up to which data has been read

reset()	returns the control to the point in the stream where the mark was set
*/

