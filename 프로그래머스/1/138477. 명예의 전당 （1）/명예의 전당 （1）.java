import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            if(priorityQueue.size() > k) {
                priorityQueue.poll();
            }
            result[i] = priorityQueue.peek();
        }

        return result;
    }
}