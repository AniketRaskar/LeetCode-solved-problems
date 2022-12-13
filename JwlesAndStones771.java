import java.util.*;

class JwlesAndStones
{
    public static void main(String[] args) 
    {
      String j = "aBcd";
      String s ="ABcD";
      HashSet<Character> set=new HashSet<>();  
      char A[] = j.toCharArray();
      char B[] = s.toCharArray();
      int iCnt=0;
      for(int i=0;i<A.length;i++)
      {
        set.add(A[i]);
      }
      for(int c=0;c<B.length;c++)
      {
        if(set.contains(B[c]))
        {
            iCnt++;
        }
      }
      return iCnt;
    }
}