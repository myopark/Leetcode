/*
  https://leetcode.com/problems/number-of-islands/
*/

public class Solution {
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        
        for(int i = 0; i < grid.length; ++i){
            for(int j = 0; j < grid[0].length; ++j){
                if(grid[i][j] == '1'){
                     dfs(grid, i, j);
                     numIslands++;
                }
                    
            }
        }
        return numIslands;
    }
    
    public void dfs(char[][] grid, int i, int j){
        int[] directions = { -1, 0, 1, 0, -1};
        if( i >= grid.length || j >= grid[0].length || i < 0|| j < 0 ||
            grid[i][j] != '1')
            return;
        
        grid[i][j] = 'x';
        
        for(int d = 0; d < directions.length - 1; ++d){
            dfs(grid, i + directions[d], j + directions[d + 1]);
        }
        
        
    }
}
/*
Island surrounded by water on all 4 sides
Our stopping point will be if top, bottom, left, right all have 0's == island
keep going ifyou have not seen an 0

