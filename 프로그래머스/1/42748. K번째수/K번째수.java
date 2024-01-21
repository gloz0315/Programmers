import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int first = 0;
        int end = 0;
        int number = 0;
        
        List<Integer> numberList = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++){
            first = commands[i][0];
            end = commands[i][1];
            number = commands[i][2];
            
            numberList.add(sorting(array, first, end, number));
        }
        
        int[] answer = new int[numberList.size()];
        
        for(int i = 0; i< answer.length; i++){
            answer[i] = numberList.get(i);
        }
        
        return answer;
    }
    
    public int sorting(int[] array, int first, int end, int number){
        
        List<Integer> answerList = new ArrayList<>();
        
        for(int i = first-1; i < end; i++){
            answerList.add(array[i]);
        }
        
        Collections.sort(answerList);
        
        
        return answerList.get(number-1);
    }
}