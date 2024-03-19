class Solution {
    
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        return calculate(k, dungeons);
    }
    
    public int calculate(int k, int[][] dungeons) {
        int result = 0;
        
        for(int i = 0; i < dungeons.length; i++) {
            
            if(!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                
                result = Math.max(result, calculate(k - dungeons[i][1], dungeons));
                
                visited[i] = false;
            }
        }
        
        return Math.max(result, game(visited));
    }
    
    public int game(boolean[] visited) {
        int count = 0;
        
        for(boolean visit : visited) {
            if(visit) {
                count++;
            }
        }
        
        return count;
    }
}