import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int hourSum = 0;
        int hourMax = 0;
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        //basecase hourglass
        hourMax += arr[0][0];
        hourMax += arr[0][1];
        hourMax += arr[0][2];
        hourMax += arr[1][1];
        hourMax += arr[2][0];
        hourMax += arr[2][1];
        hourMax += arr[2][2];

        for(int i=0; i < (arr.length - 2); i++) {
            for(int j=0; j < (arr[0].length - 2); j++) {
                hourSum = 0;
                hourSum += arr[i][j];
                hourSum += arr[i][j+1];
                hourSum += arr[i][j+2];
                hourSum += arr[i+1][j+1];
                hourSum += arr[i+2][j];
                hourSum += arr[i+2][j+1];
                hourSum += arr[i+2][j+2];

                hourMax = Math.max(hourSum, hourMax);
            }
        }
        System.out.println(hourMax);
    }
}
