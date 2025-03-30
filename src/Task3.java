public class Task3 {
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        int number = 29;
        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is a composite number");
        }
    }
}
