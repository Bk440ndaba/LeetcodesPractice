import java.util.Scanner;

public class Score {
    static int maxScore = 0;  // To track the maximum score found

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the list
        int N = sc.nextInt();
        int[] list = new int[N];

        // Read the list of integers
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        // Read the target score
        int target = sc.nextInt();
        sc.close();

        // Start with the initial score of 1
        bruteForce(list, target, 1, 0);

        // Output the maximum score found
        System.out.println(maxScore);
    }

    // Brute force method to explore all possible combinations of add and multiply
    public static void bruteForce(int[] list, int target, int currentScore, int index) {
        // If the current score exceeds or equals the target, stop this path
        if (currentScore >= target) {
            return;
        }

        // Update the maximum score found so far
        maxScore = Math.max(maxScore, currentScore);

        // If there are more numbers to process, explore both add and multiply
        if (index < list.length) {
            // Option 1: Add the current number to the score
            bruteForce(list, target, currentScore + list[index], index + 1);

            // Option 2: Multiply the current score by the current number
            bruteForce(list, target, currentScore * list[index], index + 1);
        }
    }
}

