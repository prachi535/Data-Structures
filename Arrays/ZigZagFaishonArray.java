/* Problem Statement - Given an array of distinct elements, rearrange the elements of array in zig-zag fashion in O(n) time. The converted array should be in form a < b > c < d > e < f. */

import java.util.Arrays;


public class ZigZagFaishonArray {
    
    static int a[] = new int[]{4, 3, 7, 8, 6, 2, 1};
    
    public static void main(String []args){
        zigZag();
        System.out.println(Arrays.toString(a));
    }

    private static void zigZag() {
       boolean flag=true; //for '<' and flag= false for '>'
       for(int i=0;i<a.length-1;i++){
           if(flag){
               if(a[i]>a[i+1]){
                   int temp=a[i+1];
                   a[i+1]=a[i];
                   a[i]=temp;
               }
           }
           else{
               if(a[i]<a[i+1]){
                   int temp=a[i+1];
                   a[i+1]=a[i];
                   a[i]=temp;
               }
           }
           flag=!flag;
       }
        
    }
    
    private static void maxProduct(){
        int []array={1,-2,-3,8,2,};
        if(array.length<3)
            return;
        Arrays.sort(array);
    }
}
