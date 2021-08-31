package day2;

public class DFS_CountIslands {

	public static int countIslands(int[][] grid) {

		int noOfIslands = 0;

		int rows = grid.length; // no of rows

		if (rows == 0)
			return noOfIslands;

		int cols = grid[0].length; // no of columns

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == 1) {
					markVisited(grid,i, j, rows, cols);
					noOfIslands++;
				}
			}

		}

		return noOfIslands;
	}

	public static void markVisited(int[][] grid, int x, int y, int rows, int cols) {

		// boundary case (when the control is at edge very top or very bottom or very
		// right or very left)

		if (x < 0 || x >= rows || y < 0 || y >= cols || grid[x][y] != 1)
			return;
      
		grid[x][y] = 2;
		
		markVisited(grid, x + 1, y, rows, cols); // down
		markVisited(grid, x - 1, y, rows, cols); // up
		markVisited(grid, x, y + 1, rows, cols); // right
		markVisited(grid, x, y - 1, rows, cols); // left

	}
	
	public static void main(String[] args) {
		int M[][] = new int[][] {   { 1, 1, 0, 0, 0 },
									{ 0, 1, 0, 0, 1 },
									{ 0, 0, 0, 1, 1 },
									{ 0, 0, 0, 0, 0 },
									{ 1, 0, 1, 0, 1 } };
									
									System.out.println(countIslands(M));
	}
}
