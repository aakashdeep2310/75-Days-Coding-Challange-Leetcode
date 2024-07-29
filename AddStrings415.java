class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while(i>=0 || j>=0 ){
            int sum = 0, s1 = 0, s2 = 0;

            if(i>=0){
                s1 = s1 + num1.charAt(i--) - '0';
            }
            if(j>=0){
                s2 = s2 + num2.charAt(j--) - '0';
            }

            sum = s1+s2+carry;
            carry = sum/10; 
            int s = sum%10;
            ans.append(s);
        }
        if(carry>0){
            ans.append(carry);
        }

        return ans.reverse().toString();
        
    }
}
public class AddStrings415 {

    
}
