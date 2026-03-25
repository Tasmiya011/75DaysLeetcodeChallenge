class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0, rp = height.length-1;       //2 pointers approach
        while(lp < rp){
            int w = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            int area = w * ht;
            maxWater = Math.max(maxWater, area);

            if (height[lp] < height[rp]) {
                lp++; }
                else {
                    rp--;
                }
        }
        return maxWater;
    }
}