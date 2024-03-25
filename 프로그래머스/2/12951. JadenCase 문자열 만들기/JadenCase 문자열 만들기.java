import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] change = s.split(" ");
        
        for(int i = 0; i < change.length; i++) {
            String current = change[i];
            
            if(change[i].length() == 0) {
                answer += " ";
                continue;
            }
            
            answer += current.substring(0,1).toUpperCase();
            answer += current.substring(1, current.length()).toLowerCase();
            answer += " ";
        }
        
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }
        
        return answer.substring(0, answer.length()-1);
    }
}