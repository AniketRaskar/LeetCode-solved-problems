public class ChkWordOccurAsPrefixOfSentence1455 
{
    public static void main(String[] args) 
    {
       String str = "i love eating burger";
       String search = "burg";
       int s = search.length();
       String strArray[] = str.split(" ");
       for(int i =0;i<str.length();i++)
       {
            if(s>strArray[i].length())
            {
                continue;
            }
            else
            {
                int j =0;
                for(j=0;j<s;j++)
                {
                    if(search.charAt(j)== strArray[i].charAt(j))
                    {
                        continue;
                    }
                    else
                    {
                        break;
                    }
                }
                if(j==s)
                {
                    return i+1;
                }
            }
       }
    }
}
