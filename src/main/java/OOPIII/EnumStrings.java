package OOPIII;

import static OOPIII.EnumStrings.SMALL;
import static com.sun.nio.file.SensitivityWatchEventModifier.MEDIUM;

public enum EnumStrings {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Main {
    public static void main(String[] args) {

        System.out.println("string value of SMALL is " + SMALL.toString());
        System.out.println("string value of MEDIUM is " + MEDIUM.name());

    }
}
/*
In Java, we can get the string representation of enum constants
using the toString() method or the name() method.
 */