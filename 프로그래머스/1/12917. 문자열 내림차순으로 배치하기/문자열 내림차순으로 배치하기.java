import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] chArray = s.toCharArray();
        Arrays.sort(chArray);
        StringBuilder tmp = new StringBuilder(new String(chArray));
        answer = tmp.reverse().toString();
        return answer;
    }
}