import java.util.ArrayList;

public class NoSmallerThanNo 
{
    public static void main(String[] args) 
    {
      int[] A = {8,1,2,2,3};
      ArrayList<Integer> list = new ArrayList<>();
      int iCnt =0;
      for(int i=0;i<A.length;i++)
      {
        for(int j=0;j<A.length ;j++)
        {
            if(A[j]<A[i])
            {
                iCnt++;
            }
        }
        list.add(iCnt);
      }  
    }
    return list;
}
