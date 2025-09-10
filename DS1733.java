    import java.util.*;
public class DS1733 {
public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> need = new HashSet<>();
        
        for (int[] p : friendships) {
            int u = p[0] - 1, v = p[1] - 1;
            boolean ok = false;
            for (int x : languages[u]) {
                for (int y : languages[v]) {
                    if (x == y) {
                        ok = true;
                        break;
                    }
                }
                if (ok) break;
            }
            if (!ok) {
                need.add(u);
                need.add(v);
            }
        }
        
        int ans = languages.length + 1;
        for (int i = 1; i <= n; ++i) {
            int cans = 0;
            for (int v : need) {
                boolean found = false;
                for (int c : languages[v]) {
                    if (c == i) {
                        found = true;
                        break;
                    }
                }
                if (!found) cans++;
            }
            ans = Math.min(ans, cans);
        }
        return ans;
    }
    public static void main(String[] args) {
        DS1733 obj = new DS1733();
        int arr[][] = {{1},{2},{1,2}};
        int arr1[][] = {{1,2},{1,3},{2,3}};
        System.out.println(obj.minimumTeachings(2, arr, arr1));

    }
}

