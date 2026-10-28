class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int[] res = new int[2];
        while(l < r){
            if(nums[l] < target - nums[r]){
                l++;
            }
            else if(nums[l] > target - nums[r]){
                r--;
            }
            else {
                res[0] = l + 1;
                res[1] = r + 1;
                return res;
            }
        }
        return res;
    }
}
