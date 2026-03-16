class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){

            int[] freq = new int[26];

            for(char c : word.toCharArray()){
                freq[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();

            for(int f : freq){
                keyBuilder.append("#");
                keyBuilder.append(f);
            }

            String key = keyBuilder.toString();

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}