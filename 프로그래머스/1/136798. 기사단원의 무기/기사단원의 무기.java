class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] result = result(number,limit,power);
        
        for(int i = 0; i < result.length; i++) {
            answer += result[i];
        }
        
        return answer;
    }
    
    public int[] result(int number, int limit, int power) {
        int[] answer = new int[number];
        
        for(int i = 0; i < number; i++) {
            int nums = calculate(i+1);
            
            if(nums > limit)
                nums = power;
            
            answer[i] = nums;
        }
        
        return answer;
    }
    
    public int calculate(int number) {
        int cnt = 0;
        
        for(int i = 1; i*i <= number; i++) {
            if(i*i == number) cnt++;
            else if(number  % i == 0) cnt += 2;
        }
        
        return cnt;
    }
    
}