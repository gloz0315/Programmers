class Solution {
    public int solution(int[][] sizes) {
        setting(sizes);
        
        int first_max = 0;
        int second_max = 0;
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > first_max)
                first_max = sizes[i][0];
            
            if(sizes[i][1] > second_max)
                second_max = sizes[i][1];
        }
        
        return first_max * second_max;
    }
    
    public void setting(int[][] sizes) {
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
    }
}