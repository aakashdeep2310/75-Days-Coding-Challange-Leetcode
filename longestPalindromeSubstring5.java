class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<= 1){
            return s;
        }
        String LPS = "";
        int n = s.length();

        for(int i = 0; i<n; i++){
            int low = i;
            int high = i;

            while(low >= 0 && high < n && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
            }


            String palindrome = s.substring(low+1, high);
            if(palindrome.length() > LPS.length()){
                LPS = palindrome;
            }
            low = i-1;
            high = i;
            while(low >=0 && high < n  && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                
            }
            palindrome = s.substring(low+1, high);
            if(palindrome.length() > LPS.length()){
                LPS = palindrome;
            }
        }
        return LPS;
        
    }
}