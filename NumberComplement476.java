class Solution {
    public int findComplement(int num) {
        if(num == 0){
            return 1;
        }

        // conversion of decimal to binary
        int quo = num;
        StringBuilder rem = new StringBuilder();
        while(num != 0){
            rem.append(num % 2);
            num = num / 2;
        }
        
        //flipping the bits
        int ans = 0;
        for(int i = 0; i<rem.length(); i++){
            char bit = rem.charAt(i);
            rem.setCharAt(i, rem.charAt(i) == '0' ? '1' : '0');
        }

        // conversion of binary to decimal
        int sum = 0;
        for(int i = 0; i<rem.length(); i++){
            int bit = rem.charAt(i) - '0';
             sum += bit * (int)(Math.pow(2, i));   
        }
        // returning the sum of digits
        return sum;
        
    }
}
