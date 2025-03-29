public class Task10 {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 32, b = 48;
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
    }
}
