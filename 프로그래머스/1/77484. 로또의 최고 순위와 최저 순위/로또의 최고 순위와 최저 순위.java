public class Solution {
    public int[] solution(int[] lottos, int[] win_nums){
        int cnt = 0;
        int zero_count = 0;
        int[] answer = new int[2];
        
        for(int i = 0; i < lottos.length; i++){
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j])
                    cnt++;
            }
            if(lottos[i] == 0)
                zero_count++; 
        }
        
        answer[0] = Math.min(7-(cnt+zero_count),6);
        answer[1] = Math.min(7-(cnt),6);
        
        return answer;
    }

    
}