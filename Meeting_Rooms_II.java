import java.util.TreeMap;

public class Meeting_Rooms_II 
{
    public static int meetingRoom(int num[][])
    {
        TreeMap<Integer,Integer>tmap=new TreeMap<>();
        int ans=0,cnt=0;

        for (int[]i : num) 
        {
            int start=i[0];
            int end=i[1];
            tmap.put(start, tmap.getOrDefault(start,0)+1);
            tmap.put(end, tmap.getOrDefault(end, 0)-1);
        }

        for (int key  : tmap.keySet()) 
        {
            cnt+=tmap.get(key);
            ans=Math.max(ans, cnt);    
        }
 
        return ans;
    }
    public static void main(String args[])
    {
        int arr[][]={{0,20},{5,10},{7,25}};
        // int arr[][]={{0,30},{5,10},{15,20}};

        System.out.println("Total Rooms For All Meeting is : "+meetingRoom(arr));
    }    
}
