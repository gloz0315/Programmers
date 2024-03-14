import java.util.*;

class Solution {
    int length = 0;
    
    public long solution(int[] weights) {
        long answer = 0;
        
        Arrays.sort(weights);
        length = weights.length;
        
        int prev = 0;
        
        for(int i = 0; i < length - 1; i++) {
            
            if(i > 0 && weights[i] == weights[i-1]) {
                prev--;
                answer += prev;
                continue;
            }
            
            int j = findLength(weights, weights[i], i+1);
            
            prev = 0;
            
            for(; j > i ;j --){
                if(weights[i] == weights[j] ||
                   weights[i] * 2== weights[j] || 
                   weights[i] * 3 == weights[j] * 2 || 
                   weights[i] * 4 == weights[j] * 3){
                    prev++;
                }
            }
            answer += prev;
        }
        
        return answer;
    }
    
    public int findLength(int[] weight, int number, int num) {
        int left = num;
        int right = length - 1;
        
        while(left < right) {
            int mid = left + (right - left) / 2;
            
            if(weight[mid] > number * 2) {
                return mid;
            }
            
            left = mid + 1;
        }
        
        return left;
    }
                
}