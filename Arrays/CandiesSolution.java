import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*Alice is a kindergarten teacher. She wants to give some candies to the children in her class.  All the children sit in a line and each of them has a rating score according to his or her performance in the class.  Alice wants to give at least 1 candy to each child. If two children sit next to each other, then the one with the higher rating must get more candies. Alice wants to minimize the total number of candies she must buy.

For example, assume her students' ratings are [4, 6, 4, 5, 6, 2]. She gives the students candy in the following minimal amounts: [1, 2, 1, 2, 3, 1]. She must buy a minimum of 10 candies. 
*/

public class CandiesSolution {

    static long candies(int n, int[] arr) {
        long []dp=new long[n];
        long count=0;
        Arrays.fill(dp,1);
        for(int i = 1 ; i < n  ;i++){ //forward track
            if(arr[i] > arr[i-1]){
                dp[i] = dp[i] + dp[i-1]; 
            }
        }

        for(int i = n-2 ; i >= 0 ; i--){ // back track
            if(arr[i] > arr[i+1] && dp[i] <= dp[i+1]){
                dp[i] = dp[i+1] + 1;
            }
        }
        for(int i=0;i<n;i++){
            count+=dp[i];
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long result = candies(n, arr);
        System.out.println(result);
        in.close();
    }
}
