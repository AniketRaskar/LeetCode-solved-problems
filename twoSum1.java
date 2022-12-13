import java.util.*;

public class twoSum1 
{
    public static void main(String[] args) 
    {
      int Arr[] ={1,2,3,4,5};
      int r=0;
      /*for(int i=0;i<Arr.length;i++)
      {
        for(int j = i+1;j<Arr.length;j++)
        {
            if((Arr[i]+Arr[j]) ==target)
            {
                B[0]=i;
                B[1] =j;
            }
        }
      }  */
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i=0;i<Arr.length;i++)
      {
        r = target -Arr[i];
        if(map.containsValue(r))
        {
            int k=0;
            for(Integer j:map)
            {
                if(j == r)
                {
                    B[1]=k;
                    B[0]=i;
                }
                k++;
            }
            return B;
        }
        else
        {
            map.put(i,Arr[i]);
        }
      } 
    }
}
