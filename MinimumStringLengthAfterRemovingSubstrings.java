class Solution {
    public int minLength(String s) { 
    
    // Brute Force Approach : O(N*N)
    // int n = s.length();
    // String a = "AB";
    // String b = "CD";

    // while(s.contains(a) || s.contains(b)){
    //     if(s.contains(a)){
    //         s = s.replace(a, "");
    //     }
    //     if(s.contains(b)){
    //         s = s.replace(b, "");
    //     }
    // }
    // return s.length();

    // Better Approach Using Stack but we are using the memory

    // int n = s.length();
    // Stack<Character> st = new Stack<>();
    // for(int i = 0; i<n; i++){
    //     char ch = s.charAt(i);
    //     if(st.isEmpty()){
    //         st.push(ch);
    //         continue;
    //     }
    //     if(ch == 'B' && st.peek() == 'A'){
    //         st.pop();
    //     }else if(ch == 'D' && st.peek() == 'C'){
    //         st.pop();
    //     }else{
    //         st.push(ch);
    //     }   
    // }
    // return st.size();

    // Optimal Approach using read and write approch using N space but faster
    char str[] = s.toCharArray(); // N
    int n = str.length;
    int w = 0;
    for(int r = 0; r < n; r++){
        if(w == 0){
            str[w] = str[r];
            w++;
            continue;
        }
        if(str[r] == 'B' && str[w-1] == 'A'){
            w--;
        }else if(str[r] == 'D' && str[w-1] == 'C'){
            w--;
        }else{
            str[w] = str[r];
            w++;
        }
    }
    return w;
    }

}
