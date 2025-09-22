public class DS3005 {

    public int maxFrequencyElements(int[] nums) {
        byte[] freq = new byte[101];
        byte max = 0, res = 0;
        for (int n : nums) {
            byte f = ++freq[n];
            if (f > max) {
                max = f; res = f;
            } else if (f == max) 
                res += f;
        }
        return res;
    }
    public static void main(String[] args) {
        DS3005 obj = new DS3005();
        int arr[]= {1,2,2,3,1,4};
        System.out.println(obj.maxFrequencyElements(arr));
    }
}

