class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < nums2.length; i++){
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = map.get(nums1[i]);
        }

        return nums1;

    // HashMap <Integer, Integer> map = new HashMap<>();
    // for(int i = 0; i < nums1.length; i++){
    //     if(map.containsKey(nums1[i])){
    //         map.put(nums1[i], map.get(nums1[i])+1);
    //     }else{
    //         map.put(nums1[i], 1);
    //     }
    // }
    // int temp = 0;
    // int flag1 = 0; 
    // int flag2 = 0;
    // for(int i = 0; i < nums2.length-1; i++){
    //     if(map.containsKey(nums2[i])){
    //         temp = nums2[i];
    //         flag1 = 1;
    //         i++;
    //     }if(i < nums2.length && flag1 == 1){
    //         if(nums2[i] > temp){
    //             map.put(temp, nums2[i]);
    //         }
    //     }

    // }if(flag1 == 0 || flag2 == 0){
    //         map.put(temp, -1);
    //     }

    // for(int i = 0; i < nums1.length; i++){
    //     nums1[i] = map.get(nums1[i]);
    // }

    // return nums1;
   

        // int flag1 = 0, flag2 = 0;
        // for(int i = 0; i < nums1.length; i++) {
        //     flag1 = 0; flag2 = 0;
        //     for(int j = 0; j < nums2.length; j++){
        //         if(nums1[i] == nums2[j]) flag1 = 1;
        //         if(flag1 == 1 && nums1[i] < nums2[j]) {
        //             flag2 = 1;
        //             nums1[i] = nums2[j];
        //             break;
        //         }
        //     }
        //     if(flag2 == 0) nums1[i] = -1;
        // }
        // return nums1;
    }
}