class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int c1 = 0, c2 = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] < 0){
                c1++;
            }
            if(nums[i] > 0){
                c2++;
            }
        }
        int max = Math.max(c1, c2);
        return max;
    }
}
public class MaximumCountofPositiveIntegerandNegativeInteger2529 {

    
}
