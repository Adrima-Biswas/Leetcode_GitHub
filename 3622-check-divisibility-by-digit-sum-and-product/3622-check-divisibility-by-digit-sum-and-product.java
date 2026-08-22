class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int product = 1;
        while(temp > 0){
            int q = temp % 10;
            sum += q;
            product *= q;
            temp = temp / 10;
        }
        return n % (sum + product) == 0;
    }
}