/**
 * Created by jihoon on 2017. 7. 11..
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n+1][n+1];
        int[][] dp = new int[n+1][n+1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        dp[1][1] = mat[1][1];

        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                dp[i][j] = mat[i][j] + Math.max(dp[i-1][j],dp[i-1][j-1]);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            if(max < dp[n][i])
                max = dp[n][i];
        }
        System.out.println(max);
    }
}
