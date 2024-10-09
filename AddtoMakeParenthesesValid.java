class Solution {
    public int minAddToMakeValid(String s) {
        if(s.length() == 0){
            return 0;
        }
        int count = 0;
        int unmatched = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                unmatched++;
            }else{
                if(unmatched > 0){
                    unmatched--;
                }
                else{
                    count++;
                }
            }
        }
        return count + unmatched;
    }
}
