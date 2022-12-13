class GoalParser1678
{
    public static void main(String[] args) 
    {
     String s =  "G()()()()(al)";
     String str ="";
     for(int i=0;i<s.length();i++)
     {
        if(s.charAt(i)=='G')
        {
            str = str + s.charAt(i);
        }
        else if(s.charAt(i)== '('&& s.charAt(i+1)==')')
        {
            str = str+'o';
            i++;
        }
        else 
        {
            str = str+"al";
            i = i+3;
        }
     }  
    }
}