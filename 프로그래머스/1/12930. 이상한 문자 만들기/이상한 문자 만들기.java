class Solution {
    public String solution(String s) {
        String answer = "";
        int number = 0;
        String[] numberList = s.split("");
        
        for(String list : numberList) {
            if(list.contains(" ")) {
                number = 0;
            }else
                number += 1;
            
            if(number % 2 == 0)
                answer += list.toLowerCase(); 
            else 
                answer += list.toUpperCase();

        }
        
        return answer;
    }

}