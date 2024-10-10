class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int len = 0;
        int maxLen = Integer.MIN_VALUE;
        int j = 0;

        if( n<= 0){
            return 0;
        }
        //brute force 
        // for(int i = 0; i<n; i++){
        //     j = n-1;
        //     while(i<j){
        //         if(nums[i] <= nums[j] && i < j){
        //             len = j - i;
        //             maxLen = Math.max(len, maxLen);
        //             // continue;
        //             break;
        //         }else{
        //             j--;
        //         }
        //     }
        // }
        // return (maxLen == Integer.MIN_VALUE)?0:maxLen;

        //optimal approach using stack
        Stack<Integer> stack = new Stack<>();

        //insert the element in stack till the peek element is lesser than the next element in the array
        for(int i = 0; i<n; i++){
            if(stack.isEmpty() || nums[stack.peek()] > nums[i]){
                stack.push(i);
            }
        }
        
        for(int i = n-1; i >= 0; i--){
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i]){
                maxLen = Math.max(maxLen, i - stack.pop());
            }
            if(stack.isEmpty()){
                break;
            }
        }
        return maxLen;
    }
}
