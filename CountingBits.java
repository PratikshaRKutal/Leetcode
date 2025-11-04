package solutions;

public class CountingBits {
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0; // base case

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i / 2] + (i % 2);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] result1 = countBits(2);
        for (int x : result1) System.out.print(x + " ");
        System.out.println();
    }
}
