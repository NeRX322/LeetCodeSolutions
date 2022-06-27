class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            res[0] = i;
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target){
                    res[1] = k;
                    return res;
                }
            }
        }
        return res;
    }
}
