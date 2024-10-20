public class Grid {
    public static void main(String[] args) {
        
        int [][] grid = new int[5][3];
        int count = 0;
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                grid[i][j] = count++;
            }   
        }


        for(int i = 0; i<5; i++)
        {
            
            for(int j = 0; j<3; j++)
            {
                System.out.print(grid[i][j] + " ");
            }  
            
            System.out.println();
        }
        
    }
}
