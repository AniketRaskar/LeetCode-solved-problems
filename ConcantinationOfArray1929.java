public class ConcantinationOfArray1929 
{
    public static void main(String arg[])
    {
        int[] nums = {1,2,1};
        int[] ans = new int[2*nums.length];
        for(int i=0,j=0;i<nums.length;i++,j++)
        {
            ans[j]=nums[i];
        }
        for(int i=0,j=nums.length;i<nums.length;i++)
        {
            ans[j]=nums[i];
        }
    }
}
