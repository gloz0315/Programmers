import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        
        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++) {
            int result = citations.length - i;

            if(citations[i] >= result) {
                return result;
            }
        }

        return 0;
    }
}