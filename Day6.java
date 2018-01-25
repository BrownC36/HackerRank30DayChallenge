import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = "";
        String even = "";
        String odd = "";
        input = scanner.nextLine();

        for (int i = 0; i < n; i++) {
            input = scanner.nextLine();
            even = "";
            odd = "";
            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);
                if(j%2 == 0)
                    even += ch;
                else
                    odd += ch;
            }
            System.out.println(even + " " + odd);
        }
        scanner.close();
    }
}
