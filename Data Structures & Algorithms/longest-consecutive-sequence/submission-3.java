class Solution {
    public int longestConsecutive(int[] nums) {
     //Initiate the HashSet, put all element of array there
      HashSet<Integer> map = new HashSet<>();
      for (int n : nums){
        map.add(n);
      }
      int conCount = 0;
      //run a loop for each element of nums, where for n, check if n-1 exists, if it exists,
      //it is not the leader
      //if n-1 doesnt exist, while that stays true, count contiguous sequence
      for (int n : nums){
       if(!map.contains(n-1)){
           int currentNumber = n;
           int longestSeq = 1;
           while (map.contains(currentNumber +1)){
             currentNumber++;
             longestSeq++;
           }
        conCount = Math.max(conCount, longestSeq);
        }
      }
      return conCount;
    }
}
