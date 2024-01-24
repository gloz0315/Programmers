class Solution {
    public String solution(int[] food) {
        String first = "";
        String result = "";

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < food.length; i++) {
            for(int j = 0; j < food[i]/2; j++) {
                first += String.valueOf(i);
            }
        }
        result = first + "0";

        for(int i = first.length() -1; i >= 0; i--) {
            result += first.charAt(i);
        }

        return result;
    }
}