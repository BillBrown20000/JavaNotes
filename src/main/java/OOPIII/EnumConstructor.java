package OOPIII;

public enum EnumConstructor {
    Good("Verifacation Has Passed"),
    Bad("Verifacation Invalid"),
    Unknow("Unkown Verifacation");


    EnumConstructor(String s) {
    }

}
/*
In Java, an enum class may include a constructor like a regular class.
These enum constructors are either

private - accessible within the class
or
package-private - accessible within the package
 */
