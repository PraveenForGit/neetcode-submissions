class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create a HashMap which will map key and a list
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs){
            //for everyword, convert that word into char array, sort it, then convert to str
            char[] charac = word.toCharArray();
            Arrays.sort(charac);
            String key = new String(charac);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
