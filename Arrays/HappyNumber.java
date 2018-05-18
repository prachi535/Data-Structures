/*Problem Statement - A number is called happy if it leads to 1 after a sequence of steps where in each step number is replaced by sum of squares of its digit that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1. Find if the given number is happy.
*/

public class HappyNumber {
    public static boolean isHappy(int num) {
        int n=0;
        boolean flag=true;
        while(flag){
            
            n=0;
            while(num!=0){
                n+=(int) Math.pow(num%10, 2);
                num=num/10;
            }
            num=n;
            if(num/10 == 0){
                if(num==1){
                    flag=true;
                }
                else{
                    flag=false;
                }
                break;
            }
            
        }
        return (n==1)?true:false;
    }
    
    public static void main(String args[]){
        System.out.println(isHappy(13));
    }
}
