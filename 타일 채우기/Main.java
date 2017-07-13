import java.util.Scanner;

/**
 * Created by jihoon on 2017. 6. 24..
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[2] = 3;
        for(int i = 4; i <= n ; i += 2){
            for(int j = 2; j < i; j +=2 ){
                dp[i] += dp[j]*dp[i-j];
            }
            dp[i] += 2;
        }

        for(int i = 0 ; i <= n; i++){
            System.out.print(dp[i] + " ");
        }
    }
}
