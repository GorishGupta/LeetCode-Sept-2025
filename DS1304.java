public class DS1304 {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        res[0] = n * (1 - n) / 2;
        for (int i = 1; i < n; ++i)
            res[i] = i;
        return res;
    }
    public static void main(String[] args) {
        DS1304 obj = new DS1304();
        System.out.println(obj.sumZero(3));
    }
}

