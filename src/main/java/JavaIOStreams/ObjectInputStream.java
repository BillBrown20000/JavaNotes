package JavaIOStreams;

public class ObjectInputStream {
}
/*
Working of ObjectInputStream
The ObjectInputStream is mainly used to read data written
by the ObjectOutputStream.

Basically, the ObjectOutputStream converts Java objects into
corresponding streams. This is known as serialization.
Those converted streams can be stored in files or transferred through networks.

read() Method
read() - reads a byte of data from the input stream
readBoolean() - reads data in boolean form
readChar() - reads data in character form
readInt() - reads data in integer form
readObject() - reads the object from the input stream

available() 	returns the available number of bytes in the input stream
mark() 	marks the position in input stream up to which data has been read
reset() 	returns the control to the point in the input stream where the mark was set
skipBytes() 	skips and discards the specified bytes from the input stream
close() 	closes the object input stream
*/
