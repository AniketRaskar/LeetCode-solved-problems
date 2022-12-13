import java.util.*;
public class HappyNo201 
{
    public static void main(String[] args) 
    {
        int n =0;
        
        {
            while(n != 1)
            {
                int digit =0,squre=0;
                while(n != 0)
                {
                    digit = n %10;
                    squre = digit *digit +squre;
                    n = n/10;
                }
                if(squre == 1)
                {
                    return true;
                }
                HashSet<Integer> set=new HashSet();
                if(set.contains(squre))
                {
                    return false;
                }
                else
                {
                    set.add(squre);
                }
                n= squre;
            }
            if(n == 1)
            {
                return true;
            }
        }
    }
}
