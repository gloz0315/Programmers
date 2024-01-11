class Solution {
    public int solution(int n) {
        String number = "";
        
        while(n != 0) {
            number += n%3;
            n /= 3;
        }
        
        return Integer.parseInt(number,3);
    }
}