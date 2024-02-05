import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] number1 = {1,2,3,4,5};
        int[] number2 = {2,1,2,3,2,4,2,5};
        int[] number3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] numbercount = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == number1[i%5]){
                numbercount[0]++;
            }
            if(answers[i] == number2[i%8]){
                numbercount[1]++;
            }
            if(answers[i] == number3[i%10]){
                numbercount[2]++;
            }
        }
        
        int max = Math.max((Math.max(numbercount[0],numbercount[1])),numbercount[2]);
        
        List<Integer> answerList = new ArrayList<Integer>();
        
        for(int i = 0; i < numbercount.length; i++){
            if(max == numbercount[i])
                answerList.add(i+1);
        }
        
        int[] answer = new int[answerList.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}