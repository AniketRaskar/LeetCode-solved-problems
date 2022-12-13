public class SmallestletterGreaterthanTarget740 
{
    public static void main()
    {
        char nums[] ={'c','f','j'};
        char target = 'a';
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>target) return nums[i];
        }
        return nums[0];
    }
}
