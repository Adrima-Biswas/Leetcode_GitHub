class Solution {
    public void reverse(int[] arr, int i, int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    public void nextPermutation(int[] nums) {

        // Step 1: to find pivot index
        int pivot_idx = -1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                pivot_idx = i;
                break;
            }
        }

        // if pivot index is not present
        if(pivot_idx == -1) {
            reverse(nums, 0 , nums.length - 1);
            return;
        }

        // step 2: next smallest greater element
        int just_max = -1;
        for(int i = nums.length - 1; i > pivot_idx; i--) {
            if(nums[i] > nums[pivot_idx]) {
                just_max = i;
                break;
            }
        }

        // step 3: swip b/w nums[pivot_idx] & nums[just_max]
        int temp = nums[pivot_idx];
        nums[pivot_idx] = nums[just_max];
        nums[just_max] = temp;

        // step 4: 
        reverse(nums, pivot_idx + 1, nums.length - 1);
    }
}