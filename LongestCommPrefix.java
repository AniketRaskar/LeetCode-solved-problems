import java.lang.*;

class SolutionX 
{
    String s[];
    public SolutionX(String[] str)
    {
        this.s = str;
    }
    int iCnt =0;
    String f ="";
    String ans ="";
    public String longestCommonPrefix() 
    {
       for(int i=0;i<s.length;i++)
       {
            if(s[i].length()>iCnt)
            {
                iCnt = s[i].length();
                f = s[i];
            }
       }
       char fa[] = f.toCharArray();
       for(int j=0;j<s.length;j++)
       {
            char sa[] = s[j].toCharArray();
            for(int i=0;i<iCnt;i++)
            {
                if(fa[i]==(sa[i]))
                {
                    ans +=fa[i];
                }
                else
                {
                    break;
                }
            }
       }
        return ans;
    }
}
public class LongestCommPrefix
{
    public static void main(String[] args) 
    {
        String SS[] = {"flower","flow","flight"};
        SolutionX sobj= new SolutionX(SS);  
        String ans =sobj.longestCommonPrefix();
        System.out.println(ans);
    }
}