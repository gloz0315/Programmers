class Solution {
    public int solution(int a, int b, int n) {
        int total = 0;
        
        while(true) {
            if(n < a)
                break;
            
            total += (n / a) * b;
            int rest = n % a;
            
            n = (n / a) * b + rest;
        }
        
        return total;
    }
}