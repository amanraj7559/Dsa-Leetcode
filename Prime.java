public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(36));  // prints true or false
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false; // handle 0 and 1 case

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
