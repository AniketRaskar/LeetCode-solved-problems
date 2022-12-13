import javax.lang.model.util.ElementScanner14;

public class CrawlerLogFolder 
{
    public static void main(String[] args) 
    {
       String[] logs = {"d1/","d2/","../","d21/","./"};
       int iCnt =0;
       for(int i=0;i<logs.length;i++)
       {
        if(logs[i].equals("../"))
        {
            if(iCnt>0)
            {
                iCnt--;
            }
        }
        else if(logs[i].equals("./"))
        {
            continue;
        }
        else
        {
            iCnt++;
        }
       }
    }
}
