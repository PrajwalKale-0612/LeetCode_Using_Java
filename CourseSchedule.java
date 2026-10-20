import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule 
{
    public static boolean courseS(int n,int preCourse[][])
    {
        ArrayList<Integer>adj[]=new ArrayList[n];

        int indegree[]=new int[n];

        Queue<Integer>q=new LinkedList<>();

        for (int i = 0; i < n; i++) 
        {
            adj[i]=new ArrayList<Integer>();    
        }

        for (int val[]:preCourse) 
        {
            adj[val[1]].add(val[0]);
            indegree[val[0]]++;
        }

        for (int i = 0; i <n; i++) 
        {
            if (indegree[i]==0) 
            {
                q.add(i);    
            }
        }


        int count=0;

        while (!q.isEmpty()) 
        {
            int c=q.poll();
            
            count++;

            for (int j : adj[c]) 
            {
                if (--indegree[j]==0) 
                {
                    q.add(j);
                }    
            }
        }

        return count==n;
    }
    public static void main(String[] args) 
    {
        int preCourse[][]=
        {
            {1,0},
            {2,0},
            {3,1},
            {3,2},
        };
        boolean result=courseS(4, preCourse);

        System.out.println("This Course Schedule Result is  : "+result);
    }    
}
