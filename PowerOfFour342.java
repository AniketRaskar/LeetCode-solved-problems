import java.lang.*;
public class PowerOfFour342 
{
    public static void main(String[] args) 
    {
        int n=4;
        while(n>1)
        {
            if(n%4==0)
            {
                n= n/4;
            }
            else return false;
        }
}
