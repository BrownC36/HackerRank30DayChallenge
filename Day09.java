import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int factorial(int n) {
        // Complete this function
        int recurse = 0;
        if (n > 1) {
            recurse = n * factorial(n - 1);
        }
        else
            return n;

        return recurse;

    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
    }
}
