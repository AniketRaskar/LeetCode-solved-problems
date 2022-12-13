import java.lang.*;

class ValidPallindrome
{
    public static void main(String str[])
    {
        String str1 = "race a car";
        String s = str1.toLowerCase();
        String strcpy="";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>=0 && s.charAt(i)<=9)||(s.charAt(i)>=97&&s.charAt(i)<=122))
            {
                strcpy +=s.charAt(i);
            }
        }
        boolean flag = true;
        System.out.println(s);
        System.out.println(strcpy);
        for(int i=0,j=strcpy.length()-1;i<((strcpy.length()/2)+1);i++,j--)
        {
            if((strcpy.charAt(i))==(strcpy.charAt(j)))
            {
                continue;
            }
            else 
            {
                flag = false;
            }
        }
        if(flag == true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("False");
        }
    }
}