class Solution {
    public int[] productExceptSelf(int[] nums) {
        // [1,2,4,6]
        // 1, 2, 8, 24
        // 48, 48, 24, 6
        // 48, 24, 12, 8

        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int res[] = new int[n];

        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] * nums[i];
        }

        postfix[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0 ; i--){
            postfix[i] = postfix[i + 1] * nums[i];
        }
        int a = 1, b = 1;
        for(int i = 0; i < n; i++){
            if(i - 1 < 0) a = 1;
            else a = prefix[i - 1];
            if(i + 1 >= n) b = 1;
            else b = postfix[i + 1];
            res[i] = a * b;
        }
        return res;
    }
}  
 