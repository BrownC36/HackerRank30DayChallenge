import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numberOfLines = sc.nextInt();
        int currentNumber = 0, oddCounter = 3;
        for (int i = 0; i < numberOfLines; i++) {
            currentNumber = sc.nextInt();
            if(isPrime(currentNumber))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }

    public static boolean isPrime(int testNumber) {
        if(testNumber < 2)
            return false;

        if(testNumber == 2)
            return true;

        if (testNumber % 2 ==0)
            return false;

        int squareOfTest = (int)Math.sqrt(testNumber);
        for(int i = 3; i <= squareOfTest; i+=2 ){
            if(testNumber % i == 0)
                return false;
        }
        return true;
    }
}
