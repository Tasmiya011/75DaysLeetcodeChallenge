class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);

        // If char seen before AND it's inside the current window
        if (map.containsKey(c) && map.get(c) >= left) {
            left = map.get(c) + 1;  // shrink window past the duplicate
        }

        map.put(c, right);          // update/store latest index of char
        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
    }
}
        
    
