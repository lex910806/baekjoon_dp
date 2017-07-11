import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] dp = new int[m+1][m+1];

			for(int i = 1; i <= m; i++){
				dp[1][i] = i;
			}
			for(int i = 2; i <= m; i++){
				for(int j = i; j <= m; j++){
					if(i == j)
						dp[i][j] = 1;
					else
						dp[i][j] = dp[i-1][j-1] + dp[i][j-1];
				}
			}
			System.out.println(dp[n][m]);
		}
	}
}
