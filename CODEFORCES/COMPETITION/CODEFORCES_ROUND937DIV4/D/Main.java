import java.util.*;

public class Main {
    static final int N = 100020;
    static boolean[] dp = new boolean[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> bd = new ArrayList<>();
        bd.add(1);
        for (int i = 0; i < bd.size(); i++) {
            if (10 * bd.get(i) >= N) continue;
            bd.add(10 * bd.get(i));
            bd.add(10 * bd.get(i) + 1);
        }

        dp[1] = true;
        for (int i = 2; i < N; i++) {
            for (int x : bd) {
                if (i % x == 0) dp[i] |= dp[i / x];
            }
        }

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(dp[n] ? "YES" : "NO");
        }
    }
}
