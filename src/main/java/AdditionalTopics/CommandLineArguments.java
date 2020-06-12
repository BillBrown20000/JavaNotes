package AdditionalTopics;

public class CommandLineArguments {
}
/*
The command-line arguments in Java allow us to pass
arguments during the execution of the program.

Example: Command-Line Arguments
class Main {
  public static void main(String[] args) {
    System.out.println("Command-Line arguments are");

    // loop through all arguments
    for(String str: args) {
      System.out.println(str);
    }
  }
}

Passing Numeric Command-Line Arguments
class Main {
  public static void main(String[] args) {

    for(String str: args) {
      // convert into integer type
    int argument = Integer.parseInt(str);
    System.out.println("Argument in integer form: " + argument);
    }

  }
}

*/