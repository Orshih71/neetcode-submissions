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

        prefix[0] = 1;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        postfix[n - 1] = 1;
        for(int i = n - 2; i >= 0 ; i--){
            postfix[i] = postfix[i + 1] * nums[i + 1];
        }
        for(int i = 0; i < n; i++){
            res[i] = prefix[i] * postfix[i];
        }
        return res;
    }
}  
 