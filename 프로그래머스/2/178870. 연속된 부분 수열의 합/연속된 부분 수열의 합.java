class Solution {
    
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = sequence.length - 1;
        
        int left = 0;
        int right = 1;
        int total = sequence[0];
        
        while(left < right) {
            if(total == k) {
                if(answer[1] - answer[0] > right - 1 - left) {
                    answer[0] = left;
                    answer[1] = right-1;
                }
                total -= sequence[left++];
                continue;
            }
            
            if(total > k) {
                total -= sequence[left++];
                continue;
            }
            
            if(right < sequence.length) {
                total += sequence[right++];
                continue;
            }
            
            break;
        }
        
        return answer;
    }
}