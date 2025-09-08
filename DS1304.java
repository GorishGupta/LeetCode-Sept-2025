public class DS1304 {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        res[0] = n * (1 - n) / 2;
        for (int i = 1; i < n; ++i)
            res[i] = i;
        return res;
    }
    //main Function
    public static void main(String[] args) {
        DS1304 obj = new DS1304();
        int n [] = obj.sumZero(5);
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]+" ");
        }
        
    }
}

