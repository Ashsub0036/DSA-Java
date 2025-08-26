class Solution {
    public boolean canJump(int[] nums) {
           int maxReach = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false; // We've reached a point we can't pass
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        
        return maxReach >= nums.length - 1;
    }
}