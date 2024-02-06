class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i+1; j < nums.length-1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int number = nums[i] + nums[j] + nums[k];
                    answer += result(number);
                }
            }
        }
        
        return answer;
    }
    
    public static int result(int number) {
        
        for(int i = 2; i < number; i++) {
            if(number % i == 0)
                return 0;
        }
        
        return 1;
    }
}