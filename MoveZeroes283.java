public class MoveZeroes283 
{
    public static void main(String[] args) 
    {
        int nums[] ={0,1,0,3,12};
        int i=0,j=0;
        for(i=0,j=0;j<nums.length;j++)
        {
            if(nums[j]!=0)
            {
                nums[i] = nums[j];
                i++;
            }
        }
        for(int k=i;k<nums.length;k++)
        {
            nums[k]=0;
        }
    }
}
