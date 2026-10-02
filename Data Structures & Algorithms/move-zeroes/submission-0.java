class Solution {
    public void moveZeroes(int[] nums) {
       int ins = 0;
       for(int i =0; i < nums.length; i++){
         if (nums[i] == 0){
            continue;
         } else {
            nums[ins] = nums[i];
            ins++;
         }
       }
       for(int i = ins; i < nums.length; i++){
        nums[i] = 0;
       } 
    }
}