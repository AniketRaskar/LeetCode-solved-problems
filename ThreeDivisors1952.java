
public class ThreeDivisors1952 
{
    public static void main(String[] args) 
    {
        int iCnt =0,n=9;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0) iCnt++;
        }
        System.out.println(iCnt);
    }
}
