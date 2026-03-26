class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0.0, maxSum = 0.0;
        int sum = 0;

        for(int i=0; i<k; i++){
            sum += nums[i];

        }
        avg = sum * 1.0 / k;   //to get value in double or it will be in integer
        maxSum = avg;

        for(int i = k; i<nums.length; i++){
            sum += nums[i] - nums[i-k];
            avg = sum * 1.0 / k;
            maxSum = Math.max(maxSum, avg);
        }
        return maxSum;
    }
}