class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0, best = 0, maxFreq = 0;
        
        for(int r = 0; r<s.length(); r++){
             freq[s.charAt(r) - 'A']++;
        maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);

        // windowLen - maxFreq > k → invalid, shrink
        if ((r - l + 1) - maxFreq > k) {
            freq[s.charAt(l) - 'A']--;
            l++;
        }

        best = Math.max(best, r - l + 1);
        }
        return best;
    }
}