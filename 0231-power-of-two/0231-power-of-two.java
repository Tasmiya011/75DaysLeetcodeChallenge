class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
       
            while(n%2 == 0){
                n = n/2; //keep dividing until n = 1 then loop will stop & return 
            }
    return n == 1;
    }
}