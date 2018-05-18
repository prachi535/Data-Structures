/*Problem Statement - Given an unsorted list of integers, use the counting sort method to sort the list and then print the sorted list. 
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingSort2 {
static void countingSort(int[] a){
       int n=a.length;
       Map<Integer,Integer> hash=new HashMap<Integer,Integer>();
       for(int i=0;i<n;i++){
           if(hash.get(a[i])!=null)
               hash.put(a[i], (hash.get(a[i])+1));
           else 
               hash.put(a[i], 1);
       }
       for(int i=0;i<=99;i++){
           if(hash.get(i)!=null){
               int t=hash.get(i);
               for(int j=0;j<t;j++){
                   System.out.print(i+" ");
               }
           }
       }
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