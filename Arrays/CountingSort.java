/*Problem Statement - Given a list of integers, count and output the number of times each value appears as a list of space-separated integers.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingSort {
    static void countingSort(int[] a){
       int n=a.length;
       Map<Integer,Integer> hash=new HashMap<Integer,Integer>();
       for(int i=0;i<n;i++){
           if(hash.get(a[i])!=null)
               hash.put(a[i], (hash.get(a[i])+1));
           else 
               hash.put(a[i], 1);
       }
       for(int i=0;i<=99;i++)
           if(hash.get(i)==null)
               System.out.print(0+" ");
           else System.out.print(hash.get(i)+" ");
   }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       
       int[] a = new int[n];
       for(int i=0;i<n;i++){
           a[i]=in.nextInt();
       }
       countingSort(a);
    }
}