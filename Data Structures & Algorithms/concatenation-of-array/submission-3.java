class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] conNums = new int[2 * n];

        for(int i = 0; i < nums.length; i++){
            conNums[i] = nums[i];
            conNums[i+n] = nums[i];
        }
        return conNums;
    }
}