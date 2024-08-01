class Solution {
    public boolean isPowerOfTwo(int n) {
       
        if(n == 1){
            return true;
        }
        if( n== 0){
            return false;
        }
      

    boolean ans = false;
        if(n%2==0 || n == 1){
             ans = isPowerOfTwo(n/2);
        }
        if(!ans){
            return false;
        }
        return true;
        // return false;
    }
}
//
public class powerOfTwo231 {
    
}
