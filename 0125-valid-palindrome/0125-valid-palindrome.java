class Solution {
    public boolean isPalindrome(String s) {
        int str = 0, end = s.length()-1;

        while(str <= end){
            if(!Character.isLetterOrDigit(s.charAt(str))){              //to check for Alphanumeric
                str++;continue;                                            //[a-z][A-Z][0-9]
                }
                if(!Character.isLetterOrDigit(s.charAt(end))){
                    end--; continue;
                }
                char left = Character.toLowerCase(s.charAt(str));
                char right = Character.toLowerCase(s.charAt(end));

                if(left != right){
                    return false;
                }
                str++; end--;
        }
        return true;
    }
}