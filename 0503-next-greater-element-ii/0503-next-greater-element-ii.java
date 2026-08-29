class Solution {
    public int[] nextGreaterElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 2 * nums.length; i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i % nums.length]){
                map.put(stack.pop(), nums[i % nums.length]);
            }
            if(i < nums.length) stack.push(i);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }
        for(int i = 0; i < nums.length; i++){
           nums[i] = map.get(i);
        }

        return nums;
    }
}