import java.util.Scanner;

/**
 * Created by jihoon on 2017. 6. 13..
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] dp = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j] && dp[i] < dp[j] + 1 ){
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = dp[0];
        for(int i = 1; i< n ; i++){
            if(dp[i] > max)
                max = dp[i];
        }
        System.out.println(max);
    }
}
