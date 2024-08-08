class Solution {
    public int[][] generateMatrix(int n) {

        int[][] arr = new int[n][n];
        int num = 1;

        int top = 0;
        int left = 0;
        int bottom = n-1;
        int right = n-1;

        while(top<=bottom && left <= right){

            for(int j = left; j<=right; j++){
               arr[top][j] =  num++;
            }
            top++;

            for(int i = top; i<=bottom; i++){
                arr[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    arr[bottom][j] = num++;
                }
                bottom--;
            }

            if(left<=right){
                for(int i = bottom ; i>=top; i--){
                    arr[i][left] = num++;
                }
                left++;
            }
        }
        return arr;
    }
}

public class spiralMatrix2 {
    
}
