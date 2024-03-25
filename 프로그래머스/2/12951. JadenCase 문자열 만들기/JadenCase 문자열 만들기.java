class Solution {
    public String solution(String s) {
        char[] list = s.toCharArray();
        int index = 0;
        
        for(int i = 0; i < list.length; i++) {
            if(list[i] == ' ') {
                index = 0;
                continue;
            }
            
            if(index == 0) {
                list[i] = Character.toUpperCase(list[i]);
                index += 1;
            } else {
                list[i] = Character.toLowerCase(list[i]);
            }
        }
        
        return String.valueOf(list);
    }
}
