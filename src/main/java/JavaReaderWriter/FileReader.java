package JavaReaderWriter;

public class FileReader {
}
/*
Create a FileReader
FileReader input = new FileReader(String name);

Methods of FileReader

read() Method

read() - reads a single character from the reader

read(char[] array) - reads the characters from the reader and stores
in the specified array

read(char[] array, int start, int length) - reads the number of
characters equal to length from the reader and stores in the specified
array starting from the position start

getEncoding() Method
The getEncoding() method can be used to get the type of encoding
that is used to store data in the file

close() Method
To close the file reader, we can use the close() method.
Once the close() method is called, we cannot use the reader
to read the data.

ready()	checks if the file reader is ready to be read

mark()	mark the position in file reader up to which data has been read

reset()	returns the control to the point in the reader where the mark was set
*/