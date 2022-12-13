import java.util.HashMap;

class MostFrequentTargetFollowingKey2190
{
    public static void main(String[] args) 
    {
       //int[] nums = {1,100,200,1,100,1,200,1,300,1,300};
       int[] nums={2,2,2,2,3};
       int key = 2;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i-1]==key)
        {
            if(map.containsKey(nums[i]))
            {
               int fre= map.get(nums[i]);
               map.put(nums[i],fre+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
       }
       int iCnt =0,max =0;
       for(int target:map.keySet())
       {
            int temp = map.get(target);
            if(temp>iCnt) 
            {iCnt=temp;
            max = target;}
            //System.out.println(max+"  ");
            //System.out.print(target);
           
       } 
       System.out.println(max);
    }
}