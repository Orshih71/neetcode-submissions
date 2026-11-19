class Solution {
    /*
    0, 2, 2, 3, 3, 3, 3, 3, 3, 3
    3, 3, 3, 3, 3, 3, 3, 3, 2, 1,


    min(prefix[i], postfix[i]) - height[i];
    */
    public int trap(int[] height) {
        int n = height.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i < n; i++){
            max1 = Math.max(max1, height[i]);
            max2 = Math.max(max2, height[n-1-i]);
            prefix[i] = max1;
            postfix[n-1-i] = max2;
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += Math.min(prefix[i], postfix[i]) - height[i];
        }
        return ans;
    }
}
