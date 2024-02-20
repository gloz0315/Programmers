import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int length = lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -100;
                    reserve[j] = -100;
                    break;
                }
            }
        }
        
        int count = calculate(lost,reserve);
        
        
        return answer - length + count;
    }
    
    
    public int calculate(int[] lost, int[] reserve) {
        int count = 0;
        
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
                    count++;
                    reserve[j] = -100;
                    break;
                }
            }
        }
        return count;
    }
}