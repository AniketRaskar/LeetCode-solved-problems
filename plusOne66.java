
class Arithmatic
{
    int Arr[];
    Arithmatic(int[] P)
    {
        this.Arr = P;
    }
    public int[] plusOne() 
    {
        int s = Arr.length;
        for(int i=Arr.length-1;i>=0;i--)
        {
            if(Arr[i] !=0)
            {
                Arr[i]++;
                break;
            }
            else
            {
                Arr[i]=0;
            }
        }
        if(Arr[0]==0)
        {
            int[] Brr =new int[s+1];
            Brr[0] =1;
            return Brr; 
        }
       
        return Arr;
    }
}
public class plusOne66 
{
   public static void main(String[] args) 
   {
    int []Brr = new int[3];
    
    Arithmatic aobj = new Arithmatic(Brr[]);
   } 
}
