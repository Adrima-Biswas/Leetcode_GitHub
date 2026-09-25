class Solution {
    /*
    Optimized Approach : T.C - O(n) & S.C - O(1)
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int sum = (n * (n+1))/2;
            for(int i = 0; i < nums.length; i++){
                sum = sum - nums[i];
            }
            return sum;
        }
     */
    public int missingNumber(int[] nums) {
        int[] arr =  new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]] = 1; 
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
