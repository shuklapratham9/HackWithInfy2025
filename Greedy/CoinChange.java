import java.util.*;
public class CoinChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int amt=sc.nextInt();
        for(int i=0;i<n;i++){ 
            a[i]=sc.nextInt();
        }
       
        System.out.println(coinChange(a, amt));
        sc.close();
    }
      public static int coinChange(int[] c, int amount) {
       int dp[]=new int[amount+1];
       Arrays.fill(dp,amount+1);
       dp[0]=0;
       for(int i=1;i<=amount;i++){
        for(int co:c){
            if(i-co>=0){
                dp[i]=Math.min(dp[i],dp[i-co]+1);
            }
        }
       }
       return dp[amount]>amount?-1:dp[amount];
    }
}
