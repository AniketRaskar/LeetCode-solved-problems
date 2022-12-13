import java.lang.*;
public class Array 
{
    public static void main(String[] args)
    {
        
    
        public int removeElement(int[] nums, int val) 
        {
            int size = nums.length;
            int[] Arr = new int[size];
            int i=0,j=0;
            while(i<size)
            {
                if(nums[i]==val)
                {
                    i++;
                    continue;
                }
                else
                {
                    Arr[j++] =nums[i++];
                
                }
            }
            return Arr;
        
    
    }   
}

