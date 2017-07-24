import java.util.Scanner;

public class Main{
	private static int MOD = 15746;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];

		dp[0] = 1;
		dp[1] = 2;

		for(int i = 2; i < n; i++){
			dp[i] = (dp[i-1]+dp[i-2])%MOD;
		}

		System.out.println(dp[n-1]);
	}
}
