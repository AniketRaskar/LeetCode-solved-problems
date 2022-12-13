import java.lang.*;
import java.util.Arrays;
import java.util.HashMap;
public class Anagram 
{
    public static void main(String[] args) 
    {
      
      
            String s="anagram", t = "nagaram";
            char[] s1 = s.toCharArray();
            char[] s2 = t.toCharArray();
       
            for(int i=0;i<s1.length;i++)
            {
                System.out.print(s1[i]);
            }
            System.out.println();
            for(int j=0;j<s2.length;j++)
            {
                System.out.print(s2[j]);
            }
            System.out.println();
            boolean flag = true;
            int length =0;
            if(s1.length<=s2.length)
            {
                length = s1.length;
            }
            else
            {
                length = s2.length;
            }
            for(int i=0,j=0;i<length;i++,j++)
            {
                if(s1[i]==s2[j])
                {
                    continue;
                }
                else
                {
                    flag = false;
                }
            }
            System.out.println(flag);
      
    }
}
