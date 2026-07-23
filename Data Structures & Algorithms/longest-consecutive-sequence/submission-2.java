class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> map = new HashSet<>();
       int conCount = 0;
       for (int n : nums){
           map.add(n);
       }
       for (int n : nums){
       if(!map.contains(n-1)){
        int currentNum = n;
        int currentStreak = 1;
        while (map.contains(currentNum + 1)){
            currentNum++;
            currentStreak++;
        }
        conCount = Math.max(currentStreak, conCount);
       }
    }
       return conCount;
    }
}
