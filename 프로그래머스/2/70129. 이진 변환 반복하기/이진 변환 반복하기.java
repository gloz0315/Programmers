class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(!s.equals("1")) {

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0')
                    answer[1]++;
            }

            s = s.replaceAll("0","");

            int length = s.length();
            s = Integer.toBinaryString(length);
            answer[0]++;
        }
        System.out.println(answer[0] + " 와 " + answer[1]);
        return answer;
    }
}