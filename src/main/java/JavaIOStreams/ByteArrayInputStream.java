package JavaIOStreams;

public class ByteArrayInputStream {
    ByteArrayInputStream inputStream = new ByteArrayInputStream();
}
/*
java.io.ByteArrayInputStream package first. Once we import the package,
here is how we can create an input stream.

// Creates a ByteArrayInputStream that reads entire array
ByteArrayInputStream input = new ByteArrayInputStream(byte[] arr);

available() Method
To get the number of available bytes in the input stream,
we can use the available() method.

skip() Method

Other Methods Of ByteArrayInputStream
Methods	Descriptions
finalize()	ensures that the close() method is called

mark()	marks the position in input stream up to which data has been read

reset()	returns the control to the point in the input stream where the mark was set

markSupported()	checks if the input stream supports mark() and reset()
*/
