import java.lang.*;
import java.util.*;
class SolutionX 
{
    public int Arr[];
    int t;
    public SolutionX(int [] nums,int target)
    {
        this.Arr = nums;
        this.t = target;
    }

    public int searchInsert() 
    {
        Arrays.sort(Arr);
        for(int i=0;i<Arr.length;i++)
        {
            if((Arr[i]== t)||(Arr[i]>t))
            {
                break;
                return i;
            }
            break;
        }
        
        return 1;
    }
}
public class ArrayIndex 
{
    public static void main(String[] args) 
    {
        
    }
}
