import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        for(int num : tangerine) {
            if(map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
                continue;
            }
            map.put(num, 1);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (Integer value : map.values()) {
            arr.add(value);
        }

        Collections.sort(arr,Collections.reverseOrder());
        
        for(Integer a : arr){
            answer++;
            k = k - a;
            if((k) <= 0){
                break;
            }
        }

        return answer;
    }
}