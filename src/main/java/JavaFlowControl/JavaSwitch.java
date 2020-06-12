package JavaFlowControl;

public class JavaSwitch {
    public static void main(String[] args) {

        int placeHolder = 5;
        String fruit;
        
        switch (placeHolder){
            case 1:
                fruit = "Banana";
                break;
            case 2:
                fruit ="Orange";
                break;
            case 3:
                fruit = "Cherry";
                break;
            case 4:
                fruit = "Apples";
                break;
            case 5:
                fruit = "Grapes";
                break;
            case 6:
                fruit = "Mangoes";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + placeHolder);
        }
        System.out.println("My favorite fruit is " + fruit);


    }


}
    /*Note: The Java switch statement only works with:
Java Primitive data types: byte, short, char, and int
Java Enumerated types
Java String Class
Java Wrapper Classes: Character, Byte, Short, and Integer.
*/

    /* MAKING A CALCULATOR OUT OF A SWITCH STATEMENT
    char operator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operator (either +, -, * or /): ");

        // ask user to enter operator
        operator = scanner.next().charAt(0);
        System.out.print("Enter number1 and number2 respectively: ");

        // ask user to enter numbers
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.print(number1 + "+" + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.print(number1 + "-" + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.print(number1 + "*" + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.print(number1 + "/" + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
     */
