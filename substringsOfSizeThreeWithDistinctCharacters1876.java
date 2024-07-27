import java.util.HashMap;
import java.util.Map;

  
public class substringsOfSizeThreeWithDistinctCharacters1876{
    public int countGoodSubstrings(String s) {
        int k = 3;
        int n = s.length();
        int i = 0;
        int j = 0;
        Map<Integer, String> sub = new HashMap<>();
        int count = 0;
        while(j<n){
            if(j-i+1<k){
                j++;
            }else if(j-i+1 == k){
                sub.put(s.charAt(j), map.ke);
                i++;
                j++;
            }
        }
  
}

public static void main(String[] args) {
    
}
    
}