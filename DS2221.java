public class DS2221 {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        
        for (int size = n; size > 1; size--) {
            for (int i = 0; i < size - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }

        return nums[0];
    }
    public static void main(String[] args) {
        DS2221 obj = new DS2221();
        int arr[] = {1,2,3,4,5};
        System.out.println(obj.triangularSum(arr));
    }
}
