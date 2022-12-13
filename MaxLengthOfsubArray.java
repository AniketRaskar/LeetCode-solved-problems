class MaxLengthOfsubArray
{
    public static void main(String[] args) 
    {
       // nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
       int size =0;
       if(n1.length>n2.length)
       {
        size = n2.length;
       }
       else
       {
        size = n1.length;
       }
       int iCnt1 =0,iCnt2=0;
       for(int i=0;i<size;i++)
       {
        if(n1[i]==n2[i])
        {
            iCnt2++;
            if(iCnt2>iCnt1)
            {
                iCnt1 = iCnt2;
            }
        }
        else
        {
            iCnt2 =0;
        }
       }
  
    }
}