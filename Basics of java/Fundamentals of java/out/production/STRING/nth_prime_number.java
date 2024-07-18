public class nth_prime_number {
    public static int findNthPrime(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }

        int count = 0;
        int num = 1;

        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }

        return num;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }




        public static void main(String[] args) {
            int n = 10;
            System.out.println("The " + n + "th prime number is: " + findNthPrime(n));
        }


    }
