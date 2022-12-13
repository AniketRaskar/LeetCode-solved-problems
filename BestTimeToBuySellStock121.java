import java.util.Vector;

public class BestTimeToBuySellStock121 
{
    public static void main(String[] args) 
    {
        int[] Arr = {7,1,5,3,6,4};
        int b=Arr[0],s=Arr[0];
        
        for(int i=1;i<Arr.length;i++)
        {
            if(Arr[i]>s) s = Arr[i];
            if(Arr[i]<b) b = Arr[i];
        }
    }
}
