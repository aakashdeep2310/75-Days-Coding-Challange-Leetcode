class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
    //   Map<Integer, Integer> map = new HashMap<>();
    //     int n = target.length;

    //     for(int i = 0; i<n; i++){
    //         map.put(target[i], map.getOrDefault(target[i], 0) + 1);
    //         map.put(arr[i], map.getOrDefault(arr[i], 0) - 1);
    //     }

    //     for(Map.Entry<Integer, Integer> entry: map.entrySet()){
    //         if(entry.getValue() !=0){
    //            return false;
    //         }
    //     }
    //     return true;


        int n = target.length;
        int m = arr.length;

        if(m!=n){
            return false;
        }

        int[] count = new int[1001];
        for(int i = 0; i<n; i++){
            count[target[i]]++;
            count[arr[i]]--;
        }

        for(int c : count){
            if(c!=0){
                return false;
            }
        }
        return true;

    }
}
public class makeTwoArrayEqual1460 {
    
}
