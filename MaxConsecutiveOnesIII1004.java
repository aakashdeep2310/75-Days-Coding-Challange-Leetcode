class Solution {
    public int longestOnes(int[] nums, int k) {

        //Brute force approach
        // int n = nums.length;
        // int zeros = 0;
        // int maxLen = 0;
        // for(int i = 0; i<n; i++){
        //     zeros = 0;
        //     for(int j = i; j<n; j++){
        //         if(nums[j] == 0){
        //             zeros++;
        //         }
        //         if(zeros<=k){
        //             int len = j - i + 1;
        //             maxLen = Math.max(maxLen, len); 
        //         }
        //     }
        // }
        // return maxLen;
        
        //Two pointer approach
    //     int n = nums.length;
    //     int l = 0;
    //     int r = 0;
        
    //     int maxLen = 0;
    //     int zeros = 0;
    //     while(r<n){
    //         if(nums[r] == 0){
    //             zeros++;
    //         }
    //         while(zeros > k){
    //             if(nums[l] == 0){
    //                 zeros--;
    //                 l++;
    //             }
    //         }
    //         if(zeros<=k){
    //             int len = r - l + 1;
    //              maxLen = Math.max(maxLen, len);
    //         }
    //     r++;
    //     }
    // return maxLen;

    // Sliding Window(Optimal)

    int n = nums.length;

    int l = 0;
    int r = 0;
    int zeros = 0;
    int maxLen = 0;

    while(r<n){
        if(nums[r] == 0){
            zeros++;
        }
        if(zeros>k){
            if(nums[l] == 0){
                zeros--;
            }
            l++;
        }
        if(zeros<= k){
            int len = r - l + 1;
            maxLen = Math.max(maxLen, len);
        }
    r++;
    }
    return maxLen;
    }
}
