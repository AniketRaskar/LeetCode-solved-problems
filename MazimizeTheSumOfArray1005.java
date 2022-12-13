import java.lang.*;
import java.util.Arrays;
public class MazimizeTheSumOfArray1005 
{
    public static void main(String[] args) 
    {
      int[]  nums = {3,-1,0,2};
      int k = 3;
      Arrays.sort(nums);
      int small = Integer.MAX_VALUE;
      int iCnt =0,s=0;
      for(int i=1;i<=k;i++)
      {
            if(nums[i]<0)
            {
                nums[i]= -nums[i];
                iCnt++;
            }
            if((nums[i]<small)&&nums[i]!=0) {small=nums[i];s=i;};
      }
      for(int x=0;x<nums.length;x++)
      {
        System.out.print(nums[x]+" ");
      }
      System.out.println();
      for(int j=iCnt;j<=k;j++)
      {
        nums[s]= -nums[s];
      }
      for(int x=0;x<nums.length;x++)
      {
        System.out.print(nums[x]+" ");
      }
      System.out.println();
      int sum=0;
      for(int c=0;c<nums.length;c++)
      {
        sum += nums[c];
      }
      System.out.println(sum);
    }
}
