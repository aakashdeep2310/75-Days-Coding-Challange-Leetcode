class Solution {
    public int findDuplicate(int[] nums) {
        // int n = nums.length;

        // for(int i = 0; i < n; i++) {
        //     for(int j = i + 1; j < n; j++) {
        //         if(nums[i] == nums[j]) {
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;

        int slow = 0;
        int fast = 0;

        // usnig index with fast and slow pointers
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        slow = 0;

        while(slow!= fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}