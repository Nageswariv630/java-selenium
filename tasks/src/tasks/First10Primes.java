package tasks;

public class First10Primes {
    public static void main(String[] args) {
        int count = 0; // Counter for prime numbers
        int number = 2; // First prime number

        System.out.println("First 10 prime numbers:");

        for (; count < 10; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}

