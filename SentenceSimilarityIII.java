class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        // TC - M + N + Min(m,n)

        if(sentence1.length() > sentence2.length()){
            return areSentencesSimilar(sentence2, sentence1); 
        }

        String smallerWords[] = sentence1.split(" ");
        String largerWords[] = sentence2.split(" ");
        int start = 0;
        int end1 = smallerWords.length-1;
        int end2 = largerWords.length-1;

        //Find Prefix word
        while(start <= end1 && smallerWords[start].equals(largerWords[start])){
            start++;
        }
        //Find Suffix word
        while(start <= end1 && smallerWords[end1].equals(largerWords[end2])){
            end1--;
            end2--;
        }

        return (start>end1);
        
    }
}
