package JavaExceptionHandling;

import java.util.logging.Logger;

public class JavaLogging {

    Logger log = Logger.getLogger("WE LOGGED");

}
/*
Java allows us to create and capture log messages and files
through the process of logging.

In Java, logging requires frameworks and APIs.
Java has a built-in logging framework in the java.util.logging package.

We can also use third-party frameworks like Log4j,
Logback and many more for logging purposes.

Each Logger has a level that determines the importance of the log message.
There are 7 basic log levels:

Log Level (in descending order)	Use
SEVERE	serious failure
WARNING	warning message, a potential problem
INFO	general runtime information
CONFIG	configuration information
FINE	general developer information (tracing messages)
FINER	detailed developer information (tracing messages)
FINEST	highly detailed developer information(tracing messages)
OFF	turn off logging for all levels (capture nothing)
ALL	turn on logging for all levels (capture everything)

A filter (if it is present) determines whether the LogRecord should be
forwarded or not. As the name suggests,
it filters the log messages according to specific criteria.

Java SE provides 5 built-in handlers:

Handlers	Use
StreamHandler	writes to an OutputStream
ConsoleHandler	writes to console
FileHandler	writes to file
SocketHandler	writes to remote TCP ports
MemoryHandler	writes to memory

Formatters
A handler can also use a Formatter to format the
LogRecord object into a string before exporting it to external systems.

Java SE has two built-in Formatters:

Formatters	Use
SimpleFormatter	formats LogRecord to string
XMLFormatter	formats LogRecord to XML form

 */
