class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ME1 = 0, ME2 = 0;
        int count1 = 0, count2 = 0; 

        for(int num : nums){
            if(num == ME1){
                count1++;
            }else if(num == ME2){
                count2++;
            }else if(count1 == 0){
                ME1 = num;
                count1 = 1;
            }else if(count2 == 0){
                ME2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        //for verification
        count1 = 0;
        count2 = 0;

        for(int num : nums){
            if(num == ME1) count1++;
            else if(num == ME2) count2++;
        }
        List <Integer> res = new ArrayList<>();

        if(count1 > nums.length/3) res.add(ME1);
        if(count2 > nums.length/3) res.add(ME2);

        return res;
    }
}