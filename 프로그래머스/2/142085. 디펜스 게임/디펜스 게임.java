import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        
        PriorityQueue<Integer> pr = new PriorityQueue<>();
        
        for(int i = 0; i < enemy.length; i++) {
            if(k > 0) {
                pr.add(enemy[i]);
                k--;
                answer++;
                continue;
            }
            
            int number = enemy[i];

            if(pr.peek() < number) {
                number = pr.poll();
                pr.add(enemy[i]);
            }
            
            int result = n - number;
            
            if(result < 0)
                break;
            
            n-=number;
            answer++;
        }
        
        return answer;
    }
}