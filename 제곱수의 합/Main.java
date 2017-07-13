import java.util.Scanner;

/**
 * Created by jihoon on 2017. 7. 2..
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        for(int i = 1 ; i <= n; i++){
            int k = (int) Math.sqrt(i);
            if(i - k*k > 0){
                dp[i] = dp[i - k*k]+1;
            }else{
                dp[i] = 1;
            }
        }
        for(int i = 0; i <=n ; i++)
            System.out.println(i+" : "+dp[i]);
    }
}
