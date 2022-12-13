public class IsSubsequence392 
{
    public static void main(String[] args) 
    {
        String s = "abc", t = "ahbgdc";
        int diff2 =0,diff1=0,k=0,j=0;
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)==s.charAt(j))
            {
                j++;
                
            }
        }
        if(j==s.length()) return true;
        else return false;
    }
}
