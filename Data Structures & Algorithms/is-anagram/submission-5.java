// class Solution {
//     public boolean isAnagram(String s, String t) {
//       HashMap<Character, Integer> hue = new HashMap<>();
//       if(s.length() != t.length())return false;

//       for(int i=0; i < s.length(); i++){
//         hue.put(s.charAt(i), hue.getOrDefault(s.charAt(i), 0) +1);
//       }
//       for(int i = 0; i <t.length(); i++){
//         char c = t.charAt(i);
//         if(!hue.containsKey(c)){
//             return false;
//         }
//         hue.put(c, hue.get(c) - 1);
//       }
//       for(int count : hue.values()){
//         if(count != 0){
//             return false;
//         }
//       }
//       return true;
//     }
// }
class Solution{
    public boolean isAnagram(String s, String t){
        char[] one = s.toCharArray();
        char[] two = t.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        if(Arrays.equals(one, two)){
            return true;
        }
        return false;
    }
}