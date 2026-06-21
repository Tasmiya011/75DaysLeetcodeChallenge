class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
    int n = grid.length;
    long N = (long) n * n;
    long expectedsum = N * (N + 1) / 2;
    long ssum = N * (N + 1) * (2*N+1) / 6;
    long actualsum = 0;
    long assum = 0;

    for(int[] row : grid){
        for(int num : row){
            actualsum += num;
            assum += (long) num * num;
        }
    }
    long diff = actualsum - expectedsum;
    long ddiff = assum - ssum;
    long sum = ddiff/diff;
    int repeated = (int) ((diff+sum) /2);
    int missing = (int) (sum - repeated);
    
    return new int[]{repeated, missing};
    }
}
