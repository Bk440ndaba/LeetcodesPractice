// Java code to implement the approach

/*Given a grid of size N * M consisting of O’s and X’s. The task is to find the number of ‘X’ total shapes. */
import java.io.*;
 
class GFG {
 
  // Function to run DFS
  static void dfs(char[][] grid, int x, int y)
  {
 
    // Checking whether the cell is within
    // the matrix bounds
    if (x < 0 || y < 0 || x >= grid.length
        || grid[x].length <= y) {
      return;
    }
 
    // If grid value is X, we update the
    // grid value as 0 and call the
    // function recursively for
    // adjacent nodes.
    if (grid[x][y] == 'X') {
      grid[x][y] = 'O';
      dfs(grid, x + 1, y);
      dfs(grid, x, y + 1);
      dfs(grid, x - 1, y);
      dfs(grid, x, y - 1);
    }
  }
 
  // Function to find the number of
  // 'X' total shapes.
  static int xShape(char[][] grid)
  {
    int n = grid.length;
    int m = grid[0].length;
    int i, j, ans = 0;
 
    // Traversing all the cells of the matrix.
    for (i = 0; i < n; i++) {
      for (j = 0; j < m; j++) {
 
        // If grid value is X, we increment
        // the counter and call the
        // dfs function.
        if (grid[i][j] == 'X') {
          ans++;
          dfs(grid, i, j);
        }
      }
    }
 
    // Returning the count.
    return ans;
  }
 
  public static void main(String[] args)
  {
    char[][] grid = { { 'X', 'O', 'X' },
                     { 'O', 'X', 'O' },
                     { 'X', 'X', 'X' } };
 
    // Function call
    System.out.println(xShape(grid));
  }
}
