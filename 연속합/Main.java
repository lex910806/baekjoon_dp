import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];

		for(int i = 1; i <= n; i++){
			arr[i] = sc.nextInt();
		}
		dp[1] = arr[1];
		for(int i = 1; i <= n; i++){
			if(dp[i-1] > 0){
				dp[i] = dp[i-1]+arr[i];
			}
			else{
				dp[i] = arr[i];
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i = 1; i <= n; i++){
			if(dp[i] > max)
				max = dp[i];
		}
		System.out.println(max);
	}
}
