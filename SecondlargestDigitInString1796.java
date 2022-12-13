public class SecondlargestDigitInString1796 
{
  public static void main(String[] args) 
  {
    String s = "dfa12321afd";
    //String s = "abc1111";
    int no1=-1,no2=-1,no=-1;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)-'0'>=0&&s.charAt(i)-'0'<=9)
        {
            no = s.charAt(i)-'0';
            if(no>no1)
            {
                no2=no1;
                no1=no;
            }
            /*else if(no>no2)
            {
                no2 = no;
            }*/
        }
        System.out.println(no1+"    "+no2);
    }
    //if(no2==0) return -1;
    //else return no2;
  }  
}
