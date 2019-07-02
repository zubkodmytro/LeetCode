public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int z = i+1; z < nums.length; z++) {
                if (nums[i] + nums[z] == target) {
                    int[] arr = {i, z};
                    return arr;
                }
            }
        }
        return null;
    }
}
