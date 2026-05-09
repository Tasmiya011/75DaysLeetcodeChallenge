class Solution {
    public int bulbSwitch(int n) {    
        int count = 0;    // counts the perfect squares

        int i = 1;    // checks the current no starting from 1 till n 
        while(i * i <= n){
            count++;
            i++;
        }
        return count;
    }
}