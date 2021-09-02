package day4_dfs;


/**
 * Given a grid consisting of '0's(Water) and '1's(Land). Find the number of islands.
Note: An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.
 

Example 1:

Input:
grid = {{0,1},{1,0},{1,1},{1,0}}
Output:
1
Explanation:
The grid is-
0 1
1 0
1 1
1 0
All lands are connected.
Example 2:

Input:
grid = {{0,1,1,1,0,0,0},{0,0,1,1,0,1,0}}
Output:
2
Expanation:
The grid is-
0 1 1 1 0 0 0
0 0 1 1 0 1 0 
There are two islands one is colored in blue 
and other in orange.
 

Your Task:
You don't need to read or print anything. Your task is to complete the function numIslands() which takes grid as input parameter and returns the total number of islands.

 * @author Durga Prasad
 *
 */

//https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/1/?track=DSASP-Graph&batchId=154#
public class IslandDFSEightDirections {
    // Function to find the number of islands.
    public  static int numIslands(char[][] grid) {
        int islands = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    islands++;  // when found 1 increment the counter & track all the adjacent 1s and make it visited
                    dfs(grid,i,j); 
                }        
            }
        }
        
        return islands;
    }
    
    public static void dfs(char[][]grid, int x, int y){
        
        if(x<0 || x>=grid.length||y<0||y>=grid[0].length||grid[x][y]!=1){
            return;
        }
        grid[x][y] ='2';  // if already visited make it to 2 so we don't visit again
        
        
        // traverse in all the 8 directions
        dfs(grid,x-1,y); 
        dfs(grid,x,y+1);
        dfs(grid,x+1,y);
        dfs(grid,x,y-1);
        dfs(grid,x+1,y+1);
        dfs(grid,x-1,y+1);
        dfs(grid,x-1,y-1);
        dfs(grid,x+1,y-1);
        
    }
    
    public static void main(String[] args) {
    	char [][]grid = {{0,1,1,1,0,0,0},{0,0,1,1,0,1,0}};
    	System.out.println(numIslands(grid));  //2
	}
    
}
