/*Problem -Statement
 * Sharon wants to buy a laptop for programming. She plans on buying a laptop whose price is made of digits 4 and 7 only.
 *  The number of 4s and 7s in the price should be equal. 
 *  You are given laptop brand names and their prices. 
 *  Find and print the name of the laptop brand that satisfies the above criteria.
 *   If there are multiple brands that meet the criteria, print the name of the one with the minimum price. 
 *   If none of the laptops meet the criteria print -1.
 *   For example, if Sharon has a choice between laptops 'BestBook' priced at 444777 and 'LapBook' priced at 7744, the solution should indicate ideal choice to be 'LapBook'. Although both 'BestBook' and 'LapBook' have equal number of 4s and 7s in the price, 'LapBook' is priced lower which makes it the right choice for Sharon. 
 * */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class LuckyPurchase {
    
    static boolean count_four_seven(int value){
        int count_four=0;
        int count_seven=0;
        if(value==0)
            return false;
        while(value!=0){
            int temp=value%10;
            if(temp==4)
                count_four++;
            if(temp==7)
                count_seven++;
            value=value/10;
        }
        if(count_four==0 || count_seven==0 || count_four!=count_seven)
            return false;
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <String ,Integer> hash=new HashMap<String , Integer>();
        for(int a0 = 0; a0 < n; a0++){
            String name = in.next();
            int value = in.nextInt();
            boolean ans=count_four_seven(value);
            if(ans){
                hash.put(name, value);
            }
        }
        if(hash.isEmpty() || hash==null){
            System.out.println(-1);
            in.close();
            return;
        }
        int min=Integer.MAX_VALUE ;
        String a="";
        for(String key : hash.keySet()){
           int t=hash.get(key);
           if(t<min){
               min=t;
               a=key;
           }
        }
        System.out.println(a);
        in.close();
    }
}
