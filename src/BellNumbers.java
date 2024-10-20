import java.util.Arrays; 
//Given a set of n elements, find number of ways of partitioning it.
public class BellNumbers { 

	// Function to calculate the Bell number for 'n' 
	static int bellNumbers(int n) 
	{ 
		// Initialize the previous row of the Bell triangle 
		// with dp[0] = 1 
		int[] dp = new int[n + 1]; 
		Arrays.fill(dp, 0); 
		dp[0] = 1; 

		for (int i = 1; i <= n; i++) { 
			// The first element in each row is the same as 
			// the last element in the previous row 
			int prev = dp[0]; 
			dp[0] = dp[i - 1]; 

			for (int j = 1; j <= i; j++) { 
				// The Bell number for n is the sum of the 
				// Bell numbers for all previous partitions 
				int temp = dp[j]; 
				dp[j] = prev + dp[j - 1]; 
				prev = temp; 
			} 
		} 

		return dp[0]; 
	} 

	public static void main(String[] args) 
	{ 
		int n = 3; 
		System.out.println(bellNumbers(n)); 
	} 
}
