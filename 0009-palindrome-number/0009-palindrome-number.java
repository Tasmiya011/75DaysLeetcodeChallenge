class Solution {
    public boolean isPalindrome(int x) {
        int temp = x, rev = 0;
        if(x < 0){
            return false;
        }
        while(temp > 0){
            int dig = temp % 10;    //retrives the last digit and keep it
            rev = rev * 10 + dig;
            temp = temp/10;
        }
        return (rev==x);
    }
}