package JavaExceptionHandling;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
/*
ArithmeticException because we are trying to divide a number by 0.

ArrayIndexOutOfBoundsException because we have declared a new integer array
with array bounds 0 to 9 and we are trying to assign a value to index 10.
We are printing out the exception message in both the catch blocks i.e.
duplicate code.

The associativity of the assignment operator = is right to left, so an ArithmeticException is thrown first with the message / by zero.
 */
