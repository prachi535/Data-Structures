/*Given an array of integers, find and print the minimum absolute difference between any two elements in the array. For example, given the array A=[-2,2,4] we can create pairs of numbers: and . The differences for these pairs are , and . The minimum absolute difference is .
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumAbsoluteDiff {

    static int minimumAbsoluteDifference(int n, int[] a) {
       Arrays.sort(a);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n-1;i++){
            int j=i+1;
            int absD=Math.abs(a[i]-a[j]);
            if(absD<min)
                min=absD;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        in.close();
    }
}
