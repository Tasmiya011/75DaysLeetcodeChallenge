class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length - 1;
        int carry = 0;

        while(i >= 0 || k > 0){
            int numval = 0;
            if(i >= 0){
                numval = num[i];
            }
            int d =  k % 10;
            int sum = numval + d + carry;
            int digit = sum % 10;
            carry = sum/10;

            list.add(digit);

            i--;
            k = k/10;             
        }
        if(carry > 0){
            list.add(carry);
        }
        Collections.reverse(list);
        
        return list;  
    }
}