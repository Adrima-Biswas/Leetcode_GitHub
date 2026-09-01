class Solution {
    public int[] finalPrices(int[] prices) {
       int[] stack = new int[prices.length];
       HashMap<Integer, Integer> map = new HashMap<>();
        int top = -1;
       for(int i = 0; i < prices.length; i++){
        while(top >= 0 && prices[stack[top]] >= prices[i]){
            map.put(stack[top], prices[stack[top]] - prices[i]);
            top--;
        }
        top++;
        stack[top] = i;
       }  

       while(top >= 0){
        map.put(stack[top], prices[stack[top]]);
        top--;
       }

       for(int i = 0; i < prices.length; i++){
        prices[i] = map.get(i);
       }

       return prices;
    }
}