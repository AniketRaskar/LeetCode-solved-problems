import java.util.Arrays;

public class LargsestPosIntWithNegation2441 
{
    public static void main(String[] args) 
    {
        int[] nums = {-1,10,6,7,-7,1};
        // -23,40,40,40  
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
        if(nums[i]>0) return false;
        for(int i=0,j=nums.length-1;i<nums.length/2;i++,j--)
        {
            if(-nums[i]==nums[j]) return nums[j];
            if(nums[j]>(-nums[i]))
            { i--;
                continue;}
            if(nums[j]<(-nums[i])) j++;
            
        }
        return -1;
        /*
         * for(int i = 0; i < nums.length; i ++) {
          for(int j = nums.length - 1; j > 0; j --) 
          if(nums[i] + nums[j] == 0) return nums[j];
      }  
      return - 1;
         */

    }
}
