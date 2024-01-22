import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        HashMap<Character, Integer> result = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(!result.containsKey(s.charAt(i))) {
                result.put(s.charAt(i),i);
                answer[i] = -1;
            } else {
                answer[i] = i - result.get(s.charAt(i));
                result.replace(s.charAt(i),i);
            }
        }
        
        return answer;
    }
}