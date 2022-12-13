import java.util.HashMap;

public class MajorityEle 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int A[]={2,2,1,1,2,2};
        for(int i=0;i<A.length;i++)
        {
            if(map.containsKey(A[i]))
            {
                int freq=map.get(A[i]);
                map.put(A[i], freq+1);
            }
            else
            {
                map.put(A[i],1);
            }
        }
        int temp =0,size=A.length/2;
        int k =0;
        for (int i : map.keySet()) 
        {
    //  System.out.println(i+" "+map.get(i));
            if(map.get(i)>size)
            {
                return i;
            }
        } 
    }
}
