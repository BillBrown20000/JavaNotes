package JavaExceptionHandling;

public class JavaAssertions {
    public static void main(String args[]) {
        String[] weekends = {"Friday", "Saturday", "Sunday"};
        assert weekends.length == 2;
        System.out.println("There are " + weekends.length + "  weekends in a week");
    }
}
/*
Assertions in Java help to detect bugs
by testing code we assume to be true.

An assertion is made using the assert keyword.

y default, assertions are disabled and ignored at runtime.

To enable assertions, we use:

java -ea:arguments
OR

java -enableassertions:arguments
When assertions are enabled and the condition is true, the program executes normally.
 */
