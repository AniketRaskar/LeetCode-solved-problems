public class MaxProductOf2EleInArray1453 
{
   public static void main()
   {
        int arr[] ={3,4,5,2};
        int f=0,s=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>f)
            {
                s =f;
                f = arr[i];
            }
            else if(arr[i]>s)
            {
                s =arr[i];
            }
        }
   } 
}
