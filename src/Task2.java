public class Task2 {

    public static double findAverage(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return (arr[n - 1] + (n - 1) * findAverage(arr, n - 1)) / (double) n;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        double avg = findAverage(arr, arr.length);
        System.out.println("Average: " + avg);
    }
}
