/* Problem Statement - You will be given an array of integers. All of the integers except one occur twice. That one is unique in the array.
Given an array of integers, find and print the unique element.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger{

    static int find(int[] a) {
        int xor=a[0];
        for(int i=1;i<a.length;i++){
            xor^=a[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = find(a);
        System.out.println(result);
    }
}
