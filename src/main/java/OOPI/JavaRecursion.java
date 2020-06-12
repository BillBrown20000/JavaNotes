package OOPI;

public class JavaRecursion {

    static int javaRecursion(int x){
        if (x != 0)
            return x * javaRecursion(x -1);
        else
            return 1;
    }

    public static void main(String[] args) {
        int numba = 4, result;
        result = javaRecursion(numba);
        System.out.println(numba + " RECURSION " + result);
    }

}
/*
In Java, a method that calls itself is known as a recursive
method. And, this process is known as recursion.
A physical world example would be to place two parallel mirrors facing each other.
Any object in between them would be reflected recursively.
 */
