class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int current_sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            current_sum = Math.max(current_sum + nums[i], nums[i]);
            max = Math.max(current_sum, max);
        }
        return max;
    }
    /*
    Brute Force
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    */
}