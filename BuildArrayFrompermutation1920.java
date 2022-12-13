public class BuildArrayFrompermutation1920 
{
    public static void main()
    {
        int nums[] = {0,2,1,5,3,4};

        int []ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
