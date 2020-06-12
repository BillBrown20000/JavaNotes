package JavaReaderWriter;

public class StringReader {
}
/*
Create a StringReader
// Creates a StringReader
StringReader input = new StringReader(String data);

Methods of StringReader
read() Method

read() - reads a single character from the string reader

read(char[] array) - reads the characters from the reader and stores
in the specified array

read(char[] array, int start, int length) - reads the number of characters
equal to length from the reader and stores in the specified array starting
from the position start

skip() Method
To discard and skip the specified number of characters,
we can use the skip() method.

close() Method
To close the string reader, we can use the close() method.
Once the close() method is called, we cannot use the reader to read data
from the string.

ready() 	checks if the string reader is ready to be read

mark() 	marks the position in reader up to which data has been read

reset() 	returns the control to the point in the reader where the mark was set
*/