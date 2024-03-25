
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        Map<Integer, Integer> cnt = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            if (cnt.getOrDefault(x, 0) == 0) {
                ++ans;
                cnt.put(((1 << 31) - 1) ^ x, cnt.getOrDefault(((1 << 31) - 1) ^ x, 0) + 1);
            } else {
                cnt.put(x, cnt.get(x) - 1);
            }
        }
        System.out.println(ans);
    }
}
