import java.util.Arrays;

class DS3027 {
    public int numberOfPairs(int[][] P) {
        Arrays.parallelSort(P, (p, q) -> {
            return p[0] == q[0] ? (p[1] - q[1]) : (q[0] - p[0]);
        });
        final int n = P.length;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            int y = Integer.MAX_VALUE, yi = P[i][1];
            for (int j = i + 1; j < n; j++) {
                final int yj = P[j][1];
                if (yj >= yi && y > yj) {// P[j] cannot be in between
                    ans++;
                    y = yj;
                    if (yi == yj)
                        break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        DS3027 obj = new DS3027();
        int[][] points = { { 1, 2 }, { 2, 1 }, { 3, 3 } };
        System.out.println(obj.numberOfPairs(points));
    }
}