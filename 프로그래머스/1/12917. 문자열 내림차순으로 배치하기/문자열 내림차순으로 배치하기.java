import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] result = s.toCharArray();
        
        Arrays.sort(result);
        
        for(int i = result.length-1; i >= 0; i--) {
            answer += String.valueOf(result[i]);
        }
        
        return answer;
    }
}