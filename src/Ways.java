// JAVA implementation of the approach 
import java.io.*;

class GFG 
{
		
	// Function to return the 
	// value of ncr effectively 
	static int ncr(int n, int r) 
	{ 
	
		// Initialize the answer 
		int ans = 1; 
	
		for (int i = 1; i <= r; i += 1) 
		{ 
	
			// Divide simultaneously by 
			// i to avoid overflow 
			ans *= (n - r + i); 
			ans /= i; 
		} 
		return ans; 
	} 
	
	// Function to return the count of required ways 
	static int totalWays(int X, int Y, int M, int W) 
	{ 
		return (ncr(M, X) * ncr(W, Y)); 
	} 
	
	// Driver code
	public static void main (String[] args) 
	{
		int X = 4, Y = 3, M = 6, W = 5; 
	
		System.out.println(totalWays(X, Y, M, W)); 
	}
}

// This code is contributed by ajit_23

