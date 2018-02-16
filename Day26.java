import java.io.*;
import java.util.*;
import java.time.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int returnDay = sc.nextInt();
        int returnMonth = sc.nextInt();
        int returnYear = sc.nextInt();
        int dueDay = sc.nextInt();
        int dueMonth = sc.nextInt();
        int dueYear = sc.nextInt();
        int feeAmount = 0;

        if(dueDay <= returnDay && dueMonth == returnMonth && dueYear == returnYear)
            feeAmount = 15 * (returnDay - dueDay);
        if(dueMonth < returnMonth && dueYear == returnYear)
            feeAmount = 500 * (returnMonth - dueMonth);
        if(dueYear < returnYear)
            feeAmount = 10000;

        System.out.println(feeAmount);
    }
}
