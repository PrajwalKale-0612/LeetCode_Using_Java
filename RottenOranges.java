import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges 
{
    public static  int orangesRotting(int[][] grid) 
    {
        int row=grid.length;
        int col=grid[0].length;

        int minutes=0,fresh=0;

        Queue<int []> q=new LinkedList<>();


        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }

                else if(grid[i][j]==1)
                {
                    fresh++;
                }
            }
        }


        int direction[][]=
        {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1},
        };


        while(!q.isEmpty() && fresh>0)
        {
            
            int size=q.size();

            for(int i=0;i<size;i++)
            {
                int curr[]=q.poll();
                for(int[] dir : direction)
                {
                    int r=curr[0]+dir[0];
                    int c=curr[1]+dir[1];

                    if(r>=0 && c>=0 && c<col && r<row && grid[r][c]==1)
                    {
                        grid[r][c]=2;
                        q.offer(new int[]{r,c});
                        fresh--;
                    }
                }
            }
            minutes++;
        }

        return fresh==0?minutes:-1;
    }


    public static void main(String[] args) 
    {

        int grid[][]=
        {
            {2,2,1},
            {1,1,0},
            {1,1,1},
        };

        System.out.println(orangesRotting(grid));
    }    
}
