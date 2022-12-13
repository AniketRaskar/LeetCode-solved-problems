public class MaxConsecutiveOne485 
{
    public static void main(String[] args) 
    {
       int[] nums = {1,1,0,1,1,1};
       int iCnt =0,max =0;
       for(int i=0;i<nums.length;i++)
       {
            if(nums[i]==1) 
            {
                iCnt++;
                if(iCnt>max) max = iCnt;
            }
            else
            {
                iCnt =0;
            }
        }
    }
}
