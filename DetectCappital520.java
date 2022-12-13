import java.lang.*;

import javax.lang.model.util.ElementScanner14;
public class DetectCappital520 
{
    public static void main()
    {
        
        String str = "USA";
        int ccnt=0;
        int scnt =0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='A'&& str.charAt(i)<='Z') ccnt++;
            else scnt ++;
        }
        if(str.charAt(0)>='a'&& ccnt>0) return false;
        if(ccnt == 0|| ccnt ==str.length()||ccnt ==1) return true;
        else return false;
    }
}
