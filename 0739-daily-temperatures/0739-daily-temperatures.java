class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] stack = new int[temperatures.length];
        int top = -1;
        for(int i = 0; i < temperatures.length; i++){
            while(top >= 0 && temperatures[stack[top]] < temperatures[i]){
                map.put(stack[top], i - stack[top]);
                top--;
            }
            top++;
            stack[top] = i;
        }

        while(top>= 0){
            map.put(stack[top--], 0);
        }

        for(int i = 0; i < temperatures.length; i++){
            temperatures[i] = map.get(i);
        }
        return temperatures;
    }
}