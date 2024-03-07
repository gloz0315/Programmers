import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i=numbers.length - 1; i>=0; i--) {
            
            if (stack.size() == 0) {
                answer[i] = -1;
                stack.push(numbers[i]);
                continue;
            } 
            
            if(stack.peek() <= numbers[i]) {
                stack.pop();
                i++;
                continue;
            }
            
            answer[i] = stack.peek();
            stack.push(numbers[i]);
            
        }

        return answer;
    }
}
