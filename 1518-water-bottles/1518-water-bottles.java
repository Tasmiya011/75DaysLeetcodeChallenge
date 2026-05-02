class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;

        while(numBottles >= numExchange){
            int quotient = numBottles / numExchange;
            int remainder = numBottles % numExchange;
            sum = sum + quotient;
            numBottles = quotient + remainder;
        }        
    return sum;
    }
}