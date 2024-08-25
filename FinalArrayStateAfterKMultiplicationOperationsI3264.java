class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        int count = 0;
        
            //finding minimum value each time
            for(int i = 0; i<k; i++){
                int min = nums[0];
                int index = 0;

            for(int j = 0; j<n; j++){
                if(nums[j] < min){
                    min = nums[j];
                    index = j; //minimum index
                }
            }
            //multiplying each time with minimum index            
                nums[index] = multiplier * nums[index];
            
    }
        return nums;
    }
}
