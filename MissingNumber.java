public class MissingNumber {
    public static void main(String[] args) {
        int n=5;
        int[] arr = new int[n - 1];
        arr = new int[] { 2, 3, 5, 1 };

        int missing = findMissingNumber(n, arr);
        System.out.println(missing);

    }
    public static int findMissingNumber(int n, int[] arr) {
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return (int) (expectedSum - actualSum);
    }
}
