/* Problem statement - Given two integers, and , find the maximal value of xor , written , where and satisfy the following condition:
*/

import java.io.*;
import java.util.*;

public class MaximizingXOR{

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int l=in.nextInt();
        int r=in.nextInt();
        int xor=l^r;
        int maxPos=0;
        while(xor>0){
            maxPos++;
            xor>>=1;
        }
        int a=1;
        int maxXor=0;
        while(maxPos>0){
            maxXor+=a;
            a<<=1;
            maxPos--;
        }
        System.out.println(maxXor);
    }
}