class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n,m);
        answer[1] = lcm(n,m);
        
        return answer;
    }
    
    public int lcm(int num1, int num2) {
        return (num1*num2) / gcd(num1,num2);
    }
    
    public int gcd(int num1, int num2) {
        if(num2 == 0) 
            return num1;
        
        return gcd(num2, num1 % num2);
    }
}