public class CountingWordsGivenPrefix 
{
    public static void main(String[] args) 
    {
       String[] words = {"pay","attention","practice","attend"};
       String s = "at";
       int s2 = s.length();
       int iCnt =0;
       for(int i=0;i<words.length;i++)
       {
            if(s2>words[i].length())
            {
                continue;
            }
            else
            {
                int j=0;
                for(j=0;j<s2;j++)
                {
                    if(s.charAt(j)== words[1].charAt(j))
                    {
                        continue;
                    }
                    else
                    {
                        break;
                    }
                }
                if(j==s2)
                {
                    iCnt++;
                }
            }
       }
    }
}
