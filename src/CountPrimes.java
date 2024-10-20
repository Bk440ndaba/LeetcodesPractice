public class CountPrimes {

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to count the number of prime numbers in an array
    static int countPrimes(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int primeCount = countPrimes(numbers);

        System.out.println("Number of prime numbers in the array: " + primeCount);
    }
}


