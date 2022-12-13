public class MaxConsecutive1s1004 
{
    public static void main(String[] args) 
    {
       int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
       int k =2;
       int oc =0,zc=0;
       int i =0;
       for(i=0;i<nums.length;i++)
       {
            if(nums[i]==0) zc++;
            if(nums[i]==1) oc++;
            if(zc==k) break;
       }
       int max = oc;
       for(int j=i;j<nums.length;j++)
       {
            if(nums[j]==1) oc++;
            if(oc>max) max = oc;
            if(nums[j]==0&&nums[j-i]==0) continue;
            if(nums[j]==0&&nums[j-i]==1) oc--;
            
       }
    }
}
