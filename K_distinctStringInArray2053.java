import java.util.HashMap;
import java.util.Map;

class Solution {
    public String kthDistinct(String[] arr, int k) {

        int n = arr.length;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int count = 0;
        for(String s : arr){
            if(map.get(s) == 1){
                count++;
                if(count == k){
                    return s;
                }
            }
        }
        return "";
    }
}

public interface K_distinctStringInArray2053 {
    
}
