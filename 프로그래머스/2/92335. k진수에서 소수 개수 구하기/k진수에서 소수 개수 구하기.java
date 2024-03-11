import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;

        String result = Integer.toString(n,k);
        String[] list = result.split("0");

        for(int i = 0; i < list.length; i++) {
            if(list[i].equals("")) {
                continue;
            }
            
            if(isPrime(list[i])) {
                answer++;
            }
        }

        return answer;
    }
    
    public boolean isPrime(String number) {
        long change = Long.parseLong(number);

        if(change < 2) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(change); i++) {
            if(change % i == 0) {
                return false;
            }
        }

        return true;
    }
}