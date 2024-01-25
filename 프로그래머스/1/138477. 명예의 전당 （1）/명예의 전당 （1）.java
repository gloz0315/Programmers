import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];
        List<Integer> arrays = new ArrayList<>();

        int count = 0;
        for(int i = 0; i < score.length; i++) {
            arrays.add(score[i]);
            Collections.sort(arrays);

            if(i < k) {
                result[i] = arrays.get(0);
            } else {
                count++;
                result[i] = arrays.get(count);
            }
        }

        return result;
    }
}