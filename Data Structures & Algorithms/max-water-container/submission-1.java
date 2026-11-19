class Solution {
    // (j - i) * min(h[i], h[j])
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0;
        int r = n - 1;
        int ans = 0;
        while(l < r){
            int left = heights[l];
            int right =  heights[r];
            ans = Math.max(ans, (r - l) * Math.min(left, right));
            if(left > right)
                r--;
            else 
                l++;
        }
      
        return ans;
    }
}
