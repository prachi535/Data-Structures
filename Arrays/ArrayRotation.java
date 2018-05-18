/** Problem Statement-Given an array of n integers and a number ,d , perform d left rotations on the array. Then print the updated array as a single line of space-separated integers.**/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayRotation{
    
    public static void reverse(int[] a,int start,int x){
        int i=start;
        int j=x-1;
        while(i<j){
            a[i]^=a[j];
            a[j]^=a[i];
            a[i]^=a[j];
            i++;
            j--;
        }
    }
    
    static int[] leftRotation(int[] a, int k) {
            k=k%a.length;
            reverse(a,0,k);
            reverse(a,k,a.length);
            reverse(a,0,a.length);
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        System.out.println("");


        in.close();
    }
}
