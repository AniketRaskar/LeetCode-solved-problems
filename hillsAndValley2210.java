import java.lang.*;

class hillsAndValley
{
    public static void main(String[] args) 
    {
        int Arr[] ={2,4,1,1,6,5};  //{6,6,5,5,4,1}
        int iCnt =0,j=0;
        for(int i=1;i<Arr.length-1;i++)
        {
            if(Arr[j] != Arr[i])
            {
                if((Arr[i]>Arr[j])&& (Arr[i]>Arr[i+1]))
                {
                    iCnt++;
                    j=i;
                }
                else if((Arr[i]<Arr[j])&&(Arr[i]<Arr[i+1]))
                {
                    iCnt++;
                    j=i;
                }
                else if(((Arr[j]>Arr[j+1])||(Arr[j]<Arr[j+1]))&&(Arr[i]!=Arr[i+1]))
                {
                    j=i;
                }
                if(Arr[j]==Arr[j+1])
                {
                    j=i;
                }
            }
            else
            {
                j=i;
            }
        }
    }
}