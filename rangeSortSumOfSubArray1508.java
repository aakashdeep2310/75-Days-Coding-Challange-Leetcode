import java.util.Arrays;

public class rangeSortSumOfSubArray1508 {

    public static int rangeSum(int[] nums, int n, int left, int right) {
        int MOD = 1000000007;
        int s = n*(n+1)/2;
        int sum;
        int k = 0;

        int[] arr = new int[s];

        for(int i = 0; i<n; i++){
            sum = 0;
            for(int j = i; j<n; j++){
                sum = (sum + nums[j]) % MOD;
                arr[k] = sum;
                k++;
            }
        }

        Arrays.sort(arr);
        int res = 0;
        for(int i = left-1; i<right; i++){
            res = (res + arr[i]) % MOD;
        }
        return res;
    }
}
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = 4;
        int left = 1;
        int right = 5;
        int res = rangeSum(nums, n, left, right);
        System.out.println(res);
        
    }
}
