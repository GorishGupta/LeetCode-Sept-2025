import java.util.Arrays;

public class DS611 {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        for (int i = n - 1; i >= 2; i--) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        DS611 obj  = new DS611();
        int nums[] ={2,2,3,4};
        System.out.println(obj.triangleNumber(nums));
    }
}

