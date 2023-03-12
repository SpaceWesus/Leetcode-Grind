class Solution {
    public int pivotIndex(int[] nums) {

        int leftSum = 0;
        
        int rightSum;
        
        int runningSum = 0;
         
        
        // loop through an array from the end and add it all to a array/queue
        for (int j = nums.length; j >= 0; j--){ 
                
        }
        
        for (int i = 0; i < nums.length; i++){
            if (leftSum == rightSum){ // if leftSUm == right sum return i;
                return i;
            }
            else{   // else, add nums[i] to leftSum and continue to the next number in the array
                    // add 
                leftSum += nums[i];
                    
            }
        }
        
        
    }
}