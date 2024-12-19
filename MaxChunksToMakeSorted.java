class Solution {
    public int maxChunksToSorted(int[] arr) {
      int n = arr.length;
      int maxLen = Integer.MIN_VALUE;
      int count = 0;

      for(int i = 0; i < n; i++){
        maxLen = Math.max(maxLen, arr[i]);
        if(maxLen < i+1){
            count++;
        }
      }  
      return count;
    }
}
