public class LongestPrefix14 
{
   public static void main(String[] args) 
   {
    String str[] = {"flower","flow","flight"};
    String temp1 = str[0];
    String temp2 = "";
    int len =0;
    for(int i=1;i<str.length;i++)
    {
        if(temp1.length()<str[i].length()) 
        {
            len = temp1.length();
        }
        else len = str[i].length();
       for(int j=0;j<len;j++)
       {
        if(temp1.charAt(j)==str[i].charAt(j))
        {
            temp2 += temp1.charAt(j);
            temp1 = temp2;
        }
       }
    }
   // System.out.println(temp1);
   } 
}
