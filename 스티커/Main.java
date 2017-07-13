import java.util.Scanner;

/**
 * Created by jihoon on 2017. 6. 16..
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        for(int k = 0 ; k < t; k++) {
            int n = sc.nextInt();
            int[][] mat = new int[2][n];
            int[][] dp = new int[2][n];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            dp[0][0] = mat[0][0];
            dp[1][0] = mat[1][0];

            if (n > 1) {
                dp[0][1] = mat[1][0] + mat[0][1];
                dp[1][1] = mat[0][0] + mat[1][1];
            }

            for (int i = 2; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    int tmp = Math.max(dp[0][i - 2], dp[1][i - 2]);
                    switch (j) {
                        case 0:
                            dp[j][i] = Math.max(dp[1][i - 1], tmp) + mat[j][i];
                            break;
                        case 1:
                            dp[j][i] = Math.max(dp[0][i - 1], tmp) + mat[j][i];
                            break;
                    }
                }
            }
            int max = Math.max(dp[0][n - 1], dp[1][n - 1]);
            System.out.println(max);
        }
    }
}
