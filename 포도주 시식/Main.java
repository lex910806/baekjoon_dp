import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] mat = new int[n+1];
		int[] dp = new int[n+1];

		for(int i = 1; i <= n; i++){
			mat[i] = sc.nextInt();
		}
		dp[1] = mat[1];
		if(n > 1)
			dp[2] = dp[1]+ mat[2]; 
		for(int i = 3; i <= n; i++){
			int tmp = Math.max(dp[i-2] + mat[i], dp[i-1]);
			dp[i] = Math.max(tmp,dp[i-3]+mat[i]+mat[i-1]);			
		}
		System.out.println(dp[n]);
	}
}
